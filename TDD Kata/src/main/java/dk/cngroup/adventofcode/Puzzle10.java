package dk.cngroup.adventofcode;

import java.io.*;

public class Puzzle10 {

    public static void main(String[] args) {

        File fileName = new File("C:\\library\\codebase\\TDD Kata\\resources\\input9.txt");

        String line = null;
        String str = null;

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","r","s","t","u","v","x","y","z","q","w"};

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
        int min = 100000;
        for(int j = 0; j < alphabet.length; j++) {
        duplicatesFound = true;
        line = str.replace(alphabet[j],"").replace(alphabet[j].toUpperCase(),"");
            int init = 0;

            while (duplicatesFound) {
                duplicatesFound = false;
                for (int i = init; i < line.length() - 1; i++) {

                        if (line.substring(i, i + 1).equalsIgnoreCase(line.substring(i + 1, i + 2)) && !line.substring(i, i + 1).equals(line.substring(i + 1, i + 2))) {
                            String left = line.substring(0, i);
                            String right = line.substring(i + 2, line.length());
                            line = left.concat(right);
                            init = i-1 < 0 ? 0 : i-1;
                            duplicatesFound = true;
                            break;
                        }

                }

            }
            if(line.length() < min) min = line.length();
//            System.out.println("line length" + line.length());
        }
        System.out.println(min);

    }


}


