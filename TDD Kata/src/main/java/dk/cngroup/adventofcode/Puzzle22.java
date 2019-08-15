package dk.cngroup.adventofcode;


public class Puzzle22 {

    static String findMax(int[][] field) {
        int[] maxObject = {0,0,0,0};

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {


                    for (int k = 1; k <= Math.min(field.length - (i),field.length-(j)); k++) {
                        int max = 0;

                            for (int g = i; g < i + k; g++) {

                                for (int f = j; f < j + k; f++) {
                                    max += field[g][f];

                                }

                            }
                        if (max > maxObject[2]) {
                            maxObject[0] = i + 1;
                            maxObject[1] = j + 1;
                            maxObject[2] = max;
                            maxObject[3] = k;
                        }


                    }

            }
        }

        return maxObject[0] + "," + maxObject[1] +","+ maxObject[3];
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
