package Exercises;

//cvicenia Basic http://www.w3resource.com od 31 do 36

import java.util.Scanner;

public class ExerciseBasic31_36 {

    public static void Porovnaj(int a, int b){
        System.out.println(a == b ? a + " = " + b : a + " != " + b);
        System.out.println(a > b ? a + " je vacsie ako " + b : a + " nie je vacsie ako " + b);
        System.out.println(a <= b ? a + " je menej alebo rovne " + b : a + " je vacsie ako " + b);
    }

    public static int SumaCislic(int a){
        int length = String.valueOf(a).length();
        int rem = a;
        int sum = 0;
        for (int i=length-1;i>=0;i--){
            sum = sum + (rem / (int)Math.pow(10,i));
            rem = rem % (int)Math.pow(10,i);
        }
        return sum;}

    public static double AreaPolygon(double a, double b){
        double sideCount = a;
        double sideLength = b;
        double area = (a * Math.pow(b,2)/(4 * Math.tan(Math.PI/a)));
        return area;
    }

    public static double DistEarth(double a, double b, double c, double d){
        final double radius = 6371.01;
        double latitude1 = Math.toRadians(a);
        double longitude1 = Math.toRadians(b);
        double latitude2 = Math.toRadians(c);
        double longitude2 = Math.toRadians(d);

        double dist = radius * Math.acos(Math.sin(latitude1)*Math.sin(latitude2) + Math.cos(latitude1)*Math.cos(latitude2)*Math.cos(longitude1-longitude2));
        return dist;
    }
    public static void main(String[] args) {

        //cvicenie c 31
        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");


        //cvicenie c 31
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("input first integer");
        a = scan.nextInt();
        System.out.println("input second integer");
        b = scan.nextInt();
        Porovnaj(a,b);

        //cvicenie c 33
        System.out.println();
        System.out.println("suma cislic A je:" + SumaCislic(a));
        System.out.println("suma cislic B je:" + SumaCislic(b));

        //cvicenie c 35
        System.out.println();
        System.out.println("plocha polygonu s poctom stran " + a + " je " + AreaPolygon(a,b));

        //cvicenie c 36
        System.out.println();
        double la1, la2, lg1, lg2;
        System.out.println("input latitude 1");
        la1 = scan.nextDouble();
        System.out.println("input longitude 1");
        lg1 = scan.nextDouble();
        System.out.println("input latitude 2");
        la2 = scan.nextDouble();
        System.out.println("input longitude 2");
        lg2 = scan.nextDouble();
        System.out.println("vzdialenost bodov je " +DistEarth(la1,lg1,la2,lg2) + " kilometrov");

    }
}
