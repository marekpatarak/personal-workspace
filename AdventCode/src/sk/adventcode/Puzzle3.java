package sk.adventcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Puzzle3 {

	public static void main(String[] args) {
        File fileName = new File("C:\\workspace\\personal-workspace\\AdventCode\\resources\\input3.txt");

        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            int containsTwoCount = 0;
            int containsThreeCount = 0;
          
            while((line = bufferedReader.readLine()) != null) {
                Map<String, Integer> countMap = new HashMap<>();
                
                for(int i = 0; i < line.length(); i++) {
                	String chr = line.substring(i, i+1);
                	if(!countMap.containsKey(chr)) {
                		countMap.put(chr, 1);
                	} else {
                		countMap.put(chr, countMap.get(chr) + 1);
                	}
                }
                
                boolean containsTwo = false;
                boolean containsThree = false;
                
                for(String str : countMap.keySet()) {
                	if (countMap.get(str) == 2) {
                		containsTwo = true;
                	};
                	if (countMap.get(str) == 3) {
                		containsThree = true;
                	} 
                }
                
                if(containsTwo) containsTwoCount++;
                if(containsThree) containsThreeCount++;
                            
                
            }   
            
            System.out.println(containsTwoCount * containsThreeCount);

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
