package dk.cngroup.adventofcode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Puzzle2 {

    static Integer addOrSubstract(String line, Integer sum) {
        Integer value = Integer.parseInt(line.substring(1));
        Integer suma = sum;
        if(line.substring(0,1).equals("+")) {
            suma+=value;
        } else if (line.substring(0,1).equals("-")) {
            suma-=value;
        }

        return suma;
    }
    public static void main(String[] args) {

        File fileName = new File("C:\\library\\codebase\\TDD Kata\\resources\\input2.txt");

        String line = null;

        Integer sum = 0;

        ArrayList<String> values = new ArrayList<>();
        HashSet<Integer> frequencies = new HashSet<>();

        boolean doubleNotFound = true;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                values.add(line);
            }

            while (doubleNotFound) {
                for(String str : values) {
                    sum = Puzzle2.addOrSubstract(str, sum);
                    if(!frequencies.add(sum)) {
                        System.out.println(sum);
                        doubleNotFound = false;
                        break;
                    }
                }
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
    }
}
