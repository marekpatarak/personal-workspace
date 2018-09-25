package Exercises;

import java.util.Scanner;
import java.lang.Math;

//cvicenia Basic http://www.w3resource.com od 1 do do 14

public class ExerciseBasic {
    public static void main(String[] args) {

        System.out.println("1. Write a Java program to print 'Hello' on screen and then print your name on a separate line");
        System.out.println("Hello");
        System.out.println("Marek Patarak");
        System.out.println();

        System.out.println("2. Write a Java program to print the sum of two numbers.");
        System.out.println("Test Data: 74 + 36");
        System.out.println(74+36);
        System.out.println();

        System.out.println("3. Write a Java program to divide two numbers and print on the screen.");
        System.out.println("Test Data: 50/3");
        System.out.println(50/3);
        System.out.println();

        System.out.println("4. Write a Java program to print the result of the following operations.");
        System.out.println("a. -5 + 8 * 6");
        System.out.println("b. (55+9) % 9 ");
        System.out.println("c. 20 + -3*5 / 8");
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 ");
        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3*5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println();

        System.out.println("5. Write a Java program that takes two numbers as input and display the product of two numbers.");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number A:");
        int n = reader.nextInt();
        System.out.println("Enter number B:");
        int m = reader.nextInt();
        System.out.println(n * m);
        System.out.println();

        System.out.println("6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.");
        System.out.println("Enter number A:");
        n = reader.nextInt();
        System.out.println("Enter number B:");
        m = reader.nextInt();
        System.out.println(n + m);
        System.out.println(n - m);
        System.out.println(n * m);
        System.out.println(n / m);
        System.out.println(n % m);
        System.out.println();

        System.out.println("7. Write a Java program that takes a number as input and prints its multiplication table up to 10.");

        int o = reader.nextInt();
        for (int i=1; i<=10;i++) {
            System.out.println(o +" x " + i + " = "+ (o*i));
        }
        System.out.println();

        System.out.println("8. Write a Java program to display the following pattern");
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        System.out.println();

        System.out.println("9.Write a Java program to compute the specified expressions and print the output.");
        double p = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(p);
        System.out.println();

        System.out.println("10.Write a Java program to compute a specified formula.");
        p = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println(p);
        System.out.println();

        System.out.println("11.Write a Java program to print the area and perimeter of a circle.");
        double r = 7.5;
        System.out.println("Perimeter is = " + 2* Math.PI * r);
        System.out.println("Area is = " + Math.PI * r*r);
        System.out.println();

        System.out.println("12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.");
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Zadaj dlzku pola.");
        o = reader2.nextInt();
        double[] numbers = new double [o];
        double sumaPola = 0;

        for (int i = 0; i < o; i++) {
            System.out.println("Please enter number " + (i+1));
            numbers[i]= reader2.nextDouble();
            sumaPola = sumaPola + numbers[i];
        }
        System.out.println("Average is = " + sumaPola / numbers.length);

        System.out.println("14. Write a Java program to print an American flag on the screen.");
        for (int i=1; i<=15; i++) {
            if (i<=9) {
                if (i % 2 == 0) {
                    System.out.println(" * * * * *  ==================================");
                }  else {
                    System.out.println("* * * * * * ==================================");
                }
            } else {
                System.out.println("==============================================");
            }
        }



    }
}
