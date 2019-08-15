package sk.adventcode;

import java.io.*;
import java.util.ArrayList;

public class Puzzle5 {

    public static void main(String[] args) {

        File fileName = new File("C:\\library\\codebase\\TDD Kata\\resources\\input5.txt");

        String line = null;

        Integer sum = 0;

        ArrayList<Claim> claims = new ArrayList<>();

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                claims.add(Claim.convertStringToClaim(line));
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

        Integer[][] field = new Integer[Claim.findMaxWaH(claims)[0]][Claim.findMaxWaH(claims)[1]];
        field = Claim.fillClaims(claims,field);
        System.out.println(Claim.countOfClaims(field));
    }


}

class Claim {
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

    int fromLeft;
    int fromTop;
    int width;
    int height;

    public Claim(int fromLeft, int fromTop, int width, int height) {
        this.fromTop = fromTop;
        this.fromLeft = fromLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "fromLeft=" + fromLeft +
                ", fromTop=" + fromTop +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    static Claim convertStringToClaim(String line) {
        int fromLeft;
        int fromTop;
        int width;
        int height;
        String str = line.substring(line.indexOf("@")+2);
        fromLeft = Integer.parseInt(str.substring(0,str.indexOf(",")));
        str = str.substring(str.indexOf(",")+1);
        fromTop = Integer.parseInt(str.substring(0,str.indexOf(":")));
        str = str.substring(str.indexOf(":")+2);
        width = Integer.parseInt(str.substring(0,str.indexOf("x")));
        str = str.substring(str.indexOf("x")+1);
        height = Integer.parseInt(str);

        return new Claim(fromLeft,fromTop,width,height);

    }

    static Integer[] findMaxWaH(ArrayList<Claim> list) {
        int maxW = 0;
        int maxH = 0;

        for (Claim claim : list) {
            if (claim.getFromLeft() + claim.getWidth() > maxW) {
                maxW = claim.getFromLeft() + claim.getWidth();
            }

            if (claim.getFromTop() + claim.getHeight() > maxH) {
                maxH = claim.getFromTop() + claim.getHeight();
            }

        }
        return new Integer[]{maxW,maxH};
    }

    static Integer[][] fillClaims(ArrayList<Claim> claims, Integer[][] field) {
        Integer[][] claimField = field;

        for(Claim claim : claims){
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

    static Integer countOfClaims(Integer[][] field) {
        Integer count = new Integer(0);
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] != null) {
                    if (field[i][j] >= 2) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
