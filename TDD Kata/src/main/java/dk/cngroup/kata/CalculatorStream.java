package dk.cngroup.kata;

import java.util.*;
import java.util.stream.Collectors;

public class CalculatorStream {

    public static List<String> delims = new ArrayList<>();

    static {
        delims.add(",");
    }

    public int add(String input) throws Exception {
        if (input.isEmpty()){
            return 0;
        } else {

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {
                if (input.startsWith("//")) {
                    List<String> delims = new ArrayList<>();
                    delims.addAll(this.delims);
                    delims.add(input.substring(2,input.indexOf("\n")));

                    return handleSum(input.substring(input.indexOf("\n") + 1), delims);

                } else {

                    return handleSum(input, null);

                }

            }

        }
    }

    private int handleSum (String input, List<String> delims) throws Exception  {
        List<String> finalNumbers = null;
        if (delims == null) {
            // no custom delims
            finalNumbers = Arrays.asList(input.replaceAll(",","\n").split("\n"));
        } else {
            // custom delims

            String processed = input;
            for (String delim : delims) {
                processed = processed.replaceAll(delim,"\n");
            }
            finalNumbers = Arrays.asList(processed.split("\n"));

        }

        checkForNegatives(finalNumbers);
        return finalNumbers.stream().mapToInt(x -> Integer.parseInt(x)).filter(x -> x <= 1000).sum();
    }

    private void checkForNegatives (List <String> numbersList) throws Exception
    {
        List<String> negatives = numbersList.stream().filter(x -> Integer.parseInt(x) < 0).collect(Collectors.toList());
        if (negatives.size() > 0) {
            StringBuilder message = new StringBuilder("negatives not allowed:");
            negatives.stream().forEach(x -> message.append(" " + x));
            throw new Exception(message.toString());
        }
    }
}
