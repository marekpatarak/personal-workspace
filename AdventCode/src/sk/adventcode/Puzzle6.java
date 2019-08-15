package sk.adventcode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Puzzle6 {

    public static void main(String[] args) {

        File fileName = new File("C:\\library\\codebase\\TDD Kata\\resources\\input5.txt");

        String line = null;

        Integer sum = 0;

        ArrayList<Claim2> claims = new ArrayList<>();

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                claims.add(Claim2.convertStringToClaim(line));
                System.out.println(Claim2.convertStringToClaim(line));
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

        Integer[][] field = new Integer[1000][1000];
        field = Claim2.fillClaims(claims,field);
        System.out.println(Claim2.idOfClaim(field,claims));
    }


}

class Claim2 {
    public int getFromLeft() {
        return fromLeft;
    }

    public void setFromLeft(int fromLeft) {
        this.fromLeft = fromLeft;
    }

    public int getFromTop() {
        return fromTop;
    }

    public void setFromTop(int fromTop) {
        this.fromTop = fromTop;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Claim2(int id, int fromLeft, int fromTop, int width, int height) {
        this.id = id;
        this.fromLeft = fromLeft;
        this.fromTop = fromTop;
        this.width = width;
        this.height = height;
    }

    int id;

    int fromLeft;
    int fromTop;
    int width;
    int height;


    @Override
    public String toString() {
        return "Claim2{" +
                "id=" + id +
                ", fromLeft=" + fromLeft +
                ", fromTop=" + fromTop +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    static Claim2 convertStringToClaim(String line) {
        int id;
        int fromLeft;
        int fromTop;
        int width;
        int height;
        String str = line.substring(line.indexOf("#")+1);
        id = Integer.parseInt(str.substring(0,str.indexOf(" @")));
        str = str.substring(str.indexOf("@")+2);
        fromLeft = Integer.parseInt(str.substring(0,str.indexOf(",")));
        str = str.substring(str.indexOf(",")+1);
        fromTop = Integer.parseInt(str.substring(0,str.indexOf(":")));
        str = str.substring(str.indexOf(":")+2);
        width = Integer.parseInt(str.substring(0,str.indexOf("x")));
        str = str.substring(str.indexOf("x")+1);
        height = Integer.parseInt(str);

        return new Claim2(id,fromLeft,fromTop,width,height);

    }

    static Integer[] findMaxWaH(ArrayList<Claim2> list) {
        int maxW = 0;
        int maxH = 0;

        for (Claim2 claim : list) {
            if (claim.getFromLeft() + claim.getWidth() > maxW) {
                maxW = claim.getFromLeft() + claim.getWidth();
            }

            if (claim.getFromTop() + claim.getHeight() > maxH) {
                maxH = claim.getFromTop() + claim.getHeight();
            }

        }
        return new Integer[]{maxW,maxH};
    }

    static Integer[][] fillClaims(ArrayList<Claim2> claims, Integer[][] field) {
        Integer[][] claimField = field;

        for(Claim2 claim : claims){
            for (int i = claim.getFromLeft(); i < claim.getFromLeft() + claim.getWidth(); i++) {
                for (int j = claim.getFromTop(); j < claim.getFromTop() + claim.getHeight(); j++) {
                    if (claimField[i][j] == null) {
                        claimField[i][j] = 0;

                    }
                    claimField[i][j] = claimField[i][j] + 1;
                }
            }
        }

        return claimField;
    }

    static Integer idOfClaim(Integer[][] field, ArrayList<Claim2> claims) {
        Integer[][] claimField = field;

        for(Claim2 claim : claims){
            HashSet<Integer> claimFound = new HashSet<>();
            for (int i = claim.getFromLeft(); i < claim.getFromLeft() + claim.getWidth(); i++) {
                for (int j = claim.getFromTop(); j < claim.getFromTop() + claim.getHeight(); j++) {
                    claimFound.add(claimField[i][j]);
                }

            }
            if (claimFound.size()==1 && claimFound.contains(1)) return claim.getId();

        }
            return -1;
    }

}


