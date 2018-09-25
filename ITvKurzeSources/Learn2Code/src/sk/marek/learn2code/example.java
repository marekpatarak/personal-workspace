package sk.marek.learn2code;

/**
 * komentar vzor
 */

// riadkovy komentar

public class example {

    public static void main(String[] args) {
        String c = "c";
        String d = "d";
        c = d;
        d =  "dd";
        System.out.println(c + " " + d );

        int number = 10;
        String cislo = "10";
        int c2 = 100;
        String cislo2 = "50";

        number = c2 + 1;
        c2 = number - 1;

        cislo= cislo2;
        cislo2 = "daco";

        System.out.println(number + " " + c2);
        System.out.println( cislo + " " + cislo2);
    }
}
