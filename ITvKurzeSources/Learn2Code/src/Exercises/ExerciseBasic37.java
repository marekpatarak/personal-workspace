package Exercises;

//cvicenia Basic http://www.w3resource.com od 37 do ...

import java.util.Scanner;
import java.nio.charset.Charset;

public class ExerciseBasic37 {

    public static void CountChars(String sample) {
        int countLet = 0;
        int countNum = 0;
        int countSp = 0;
        int countOth = 0;
        int length = String.valueOf(sample).length();

        for (int i = 0; i < length; i++) {
            if (Character.isLetter(sample.charAt(i))) {
                countLet++;
            } else {
                if (Character.isDigit(sample.charAt(i))) {
                    countNum++;
                } else {
                    if (sample.charAt(i) == ' ') {
                        countSp++;
                    } else countOth++;
                }
            }
        }

        System.out.println("Pocet pismen je " + countLet);
        System.out.println("Pocet cisel je " + countNum);
        System.out.println("Pocet medzier je " + countSp);
        System.out.println("Pocet inych znakov je " + countOth);

    }

    public static void main(String[] args) {

        //cvicenie c 37
        String string;
        Scanner scan = new Scanner(System.in);
        System.out.println("input string to reverse");
        string = scan.nextLine();
        String Reverse = new StringBuilder(string).reverse().toString();
        System.out.println(Reverse);
        System.out.println();

        //cvicenie 38
        CountChars(string);

        //cvicenie 39
        int cisla[] = {1, 2, 3, 4};
        int pocetCisel = 0;

        for (int i = 0; i < cisla.length; i++) {
            for (int j = 0; j < cisla.length; j++) {
                for (int g = 0; g < cisla.length; g++) {
                    if (cisla[i] != cisla[j] && cisla[j] != cisla[g] && cisla[i] != cisla[g]) {
                        System.out.print(cisla[i]);
                        System.out.print(cisla[j]);
                        System.out.print(cisla[g]);
                        System.out.println();
                        pocetCisel++;
                    }
                }
            }
        }
        System.out.println("pocet unikatnych cisel je " + pocetCisel);

        //cvicenie 40
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }

        //cvicenie 41
        System.out.println("zadaj char na prevod do ASCII");
        char ch;
        int n;
        ch = scan.next().charAt(0);
        n = (int) ch;
        System.out.println("ASCII Value znaku " + ch + " je " + n);

    }
}

