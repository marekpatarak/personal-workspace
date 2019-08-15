package dk.cngroup.adventofcode;

import java.io.*;
import java.util.ArrayList;

public class Puzzle9 {

    public static void main(String[] args) {

        File fileName = new File("C:\\library\\codebase\\TDD Kata\\resources\\input9.txt");

        String line = null;
        String str = null;


        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                str = line;
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

        boolean duplicatesFound = true;
        while(duplicatesFound) {
            duplicatesFound = false;
            for (int i = 0; i < str.length()-1; i++) {
                if(str.substring(i,i+1).equalsIgnoreCase(str.substring(i+1, i+2)) && !str.substring(i,i+1).equals(str.substring(i+1, i+2))) {
                    String left = str.substring(0,i);
                    String right = str.substring(i+2,str.length());
                    str = left.concat(right);
                    duplicatesFound = true;
                    break;
                }
            }

        }
        System.out.println(str.length());

    }


}


