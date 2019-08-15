package dk.cngroup.kata;

public class EvenOrOdd {

    public String oddOrEven(int[] array) {

        if (array.length == 0) {
            return "even";
        } else {
            int count = 0;
            for (int i : array) {
                count += i;
            }

            if (count % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
        }
    }
}
