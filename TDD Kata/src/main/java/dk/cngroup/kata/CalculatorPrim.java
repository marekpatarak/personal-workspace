package dk.cngroup.kata;

import java.util.regex.Pattern;

public class CalculatorPrim {
    public static String delim = ",";

    public int add(String input) throws Exception{
        if (input.isEmpty()){
            return 0;
        } else {
            String prepared = prepareInput(input);
            if (!prepared.contains(delim)) {
                return Integer.parseInt(prepared);
            } else {
                return handleSum(prepared, delim);
            }
        }
    }

    private int handleSum(String input, String delim) throws Exception{
        String[] pole = input.split(delim);
        int sum = 0;
        boolean negatives = false;
        String excMessage = "negatives not allowed: ";
        for (String str : pole) {
            int number = Integer.parseInt(str);
            if (!negatives && (number >= 0 && number <= 1000)) {
                sum += Integer.parseInt(str);

            } else {
                if (number < 0) {
                    negatives = true;
                    excMessage += str + " ";
                }
            }

        }

        if (negatives) {
            throw new Exception(excMessage);
        } else {
            return sum;
        }
    }

    private String prepareInput(String input) {
        if (input.startsWith("//")) {
            String customDelim = input.substring(2,input.indexOf("\n"));
            String preparedInput = input.substring(input.indexOf("\n") + 1);
            return preparedInput.replaceAll(Pattern.quote(customDelim),delim).replaceAll("\n",delim);
        } else {
            return input.replaceAll("\n",delim);
        }

    }
}
