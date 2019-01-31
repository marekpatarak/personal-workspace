package sk.adventcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Puzzle4 {

	static boolean foundBestIds(String id1, String id2) {
      	int diffs = 0;

      	if (id1.equals(id2)) return false;
		for(int i = 0; i < id1.length(); i++) {
          	String chr = id1.substring(i, i+1);
          	String ch2 = id2.substring(i, i+1);
          	if(!chr.equals(ch2)){
          		diffs++;
          		if (diffs > 1) return false;
          	};
          	
		}
		
		if (diffs <= 1) {
			return true;
		}
		return false;
	}
	
	static String commonPart(String id1, String id2) {
		StringBuilder strb = new StringBuilder();
		for(int i = 0; i < id1.length(); i++) {
          	String chr = id1.substring(i, i+1);
          	String ch2 = id2.substring(i, i+1);
          	if(chr.equals(ch2)){
          		strb.append(chr);
          	};
          	
		}
		return strb.toString();
	}
	public static void main(String[] args) {
        File fileName = new File("C:\\workspace\\personal-workspace\\AdventCode\\resources\\input4.txt");

        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
        
            ArrayList<String> lines = new ArrayList<>();
            
            while((line = bufferedReader.readLine()) != null) {
            	lines.add(line);              
                
            }
            
            bufferedReader.close();         
            
            boolean foundIds = false;
            String foundId1 = null;
            String foundId2 = null;
            
            while (foundIds == false) {
            	
            	for(int i = 0; i < lines.size(); i++) {
            		if(foundIds) break;
                	for(int j = 0; j < lines.size(); j++) {
                		foundIds = Puzzle4.foundBestIds(lines.get(i), lines.get(j));
                		if (foundIds) {
                			foundId1 = lines.get(i);
                			foundId2 = lines.get(j);
                			break;
                		}
                	}
            	}
            }
            
            System.out.println(Puzzle4.commonPart(foundId1, foundId2));
   
            
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
