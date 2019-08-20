package dk.cngroup.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CalculatorBeta {

    public int add(String input) throws Exception{

        if(!input.startsWith("//")) {

            return calculateSum(input,",");
        } else {
            char delim = input.charAt(2);
            return calculateSum(input.substring(4), input.substring(2,3));
        }
    }

    private int calculateSum(String input, String delim) throws Exception {
        if (input.isEmpty()) {
            return 0;
        } else {

            if (input.contains(delim) || input.contains("\n")) {
                List<String> arr = new ArrayList<>();
                for (String str : input.split(delim)) {
                    for (String str2 : str.split("\n")) {
                        arr.add(str2);
                    }
                }

                int[] pole = arr.stream().mapToInt(x -> Integer.parseInt(x)).filter(x -> x < 0).toArray();
                if (pole.length > 0) {
                    throw new Exception("negatives not allowed, " + String.valueOf(pole[0]));
                } else {
                    return arr.stream().mapToInt(x -> Integer.parseInt(x)).sum();
                }

            } else {
                if(Integer.parseInt(input) > 0) {
                    return Integer.parseInt(input);
                } else {
                    throw new Exception("negatives not allowed, " + input);
                }

            }
        }
    }
}
