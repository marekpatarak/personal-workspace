package sk.adventcode;


public class Puzzle21 {

    static String findMax(int[][] field) {
    int[] maxObject = {0,0,0};
            for (int i = 0; i < field.length - 3; i++) {
                for (int j = 0; j < field[i].length - 3; j++) {
                    int max = 0;

                    for(int g = i; g < i+3; g++){
                        for (int f = j; f < j+3;f++) {
                            max += field[g][f];

                        }

                    }
                    if(max > maxObject[2]){
                        maxObject[0] = i+1;
                        maxObject[1] = j+1;
                        maxObject[2] = max;
                    }
                }
            }

        return maxObject[0] + "," + maxObject[1];
    }


    static int getHundredsDigit(int input) {
        int result = 0;

        if(input < 100) return result;

        result = input / 100;

        if (result > 9) {
            String resultStr = String.valueOf(result);
            result = Integer.parseInt(resultStr.substring(resultStr.length()-1));
        }

        return result;

    }

    static int[][] calculatePowerLevels(int serialNo) {
        int[][] field = new int[300][300];
        int rackId;
        int xCoor;
        int yCoor;
        int powerLevel;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                xCoor = i + 1;
                yCoor = j + 1;
                rackId = xCoor + 10;
                powerLevel = rackId * yCoor;
                powerLevel += serialNo;
                powerLevel *= rackId;
                powerLevel = getHundredsDigit(powerLevel) - 5;
                field[i][j] = powerLevel;
            }
        }
        return field;
    }

    public static void main(String[] args) {
        int serialNo = 5034;
        int [][] field = calculatePowerLevels(serialNo);
        System.out.println(findMax(field));


    }
}
