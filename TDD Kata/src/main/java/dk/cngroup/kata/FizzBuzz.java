package dk.cngroup.kata;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0 && i % 5 == 0) || (containsNum(i,"3") && containsNum(i, "5"))) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0 || containsNum(i,"3")) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 || containsNum(i,"5")) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean containsNum (int i, String num) {
        if (String.valueOf(i).contains(num)) {
            return true;
        } else {
            return false;
        }
    }
}
