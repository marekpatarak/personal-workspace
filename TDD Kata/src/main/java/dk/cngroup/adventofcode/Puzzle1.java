package dk.cngroup.adventofcode;

import java.io.*;

public class Puzzle1 {
    public static void main(String[] args) {

        // The name of the file to open.
        File fileName = new File("C:\\library\\codebase\\TDD Kata\\resources\\input1.txt");

        // This will reference one line at a time
        String line = null;

        int sum = 0;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                int value = Integer.parseInt(line.substring(1));
                if(line.substring(0,1).equals("+")) {
                    sum+=value;
                } else if (line.substring(0,1).equals("-")) {
                    sum-=value;
                }
            }
            System.out.println(sum);
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
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
