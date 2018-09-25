package Exercises;

//cvicenia Basic http://www.w3resource.com od 42

//import java.io.Console;
import java.util.Scanner;

public class ExerciseBasic42 {
    public static void main(String[] args) {

        //cvicenie 44
        int a, a1, a2;
        Scanner sken = new Scanner(System.in);
        System.out.println("vloz int");
        a = sken.nextInt();

        String s = String.valueOf(a).toString();
        String s1 = s + s;
        String s2 = s + s + s;
        a = Integer.valueOf(s);
        a1 = Integer.valueOf(s1);
        a2 = Integer.valueOf(s2);

        System.out.println(a + " + " + a1 + " + " + a2 + " = " + (a + a1 + a2));
        System.out.println();

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Divided by 3");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

            System.out.println("Divided by 5");
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + ", ");
                }
            }
        System.out.println();
            System.out.println("Divided by 3 and 5");
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0 && i % 3 == 0) {

                        System.out.print(i + ", ");
                    }

                }
            }
        }




