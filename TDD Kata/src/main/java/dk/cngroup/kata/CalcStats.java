package dk.cngroup.kata;

public class CalcStats {

    public int getMinValue(int[] input) {

        int min = input[0];
        for (int i : input){
            if(i < min) {
                min = i;
            }
        }
        return min;
    }

    public int getMaxValue(int[] input){
        int max = input[0];
        for (int i : input){
            if(i > max) {
                max = i;
            }
        }
        return max;
    }

    public int getNumberOfElems(int[] input){

        int count = 0;
        for (int i : input) {
            count++;
        }
        return count;
    }

    public double getAverage(int[] input){

        double sum = 0;
        for (int i : input) {
            sum += i;
        }

        return sum / getNumberOfElems(input);
    }
}
