package dk.cngroup.kata;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    public static Map<Character, Integer> valuesMap = new LinkedHashMap<>();
    static {
        valuesMap.put('I',1);
        valuesMap.put('V',5);
        valuesMap.put('X',10);
        valuesMap.put('L',50);
        valuesMap.put('C',100);
        valuesMap.put('D',500);
        valuesMap.put('M',1000);
    }
    public static void main(String[] args) {
        
        System.out.println(convertRomanNumeral("MMCDXXXV")); //2435
        System.out.println(convertRomanNumeral("MMDXLIII")); //2543
        System.out.println(convertRomanNumeral("MMMDCCCXL")); //3840
        System.out.println(convertRomanNumeral("MCCCXLII")); //1342

    }

    public static Integer convertRomanNumeral(String romanNumeral) {

        char[] pole = romanNumeral.toCharArray();
        Integer sum = 0;
        for (int i = 0; i < pole.length; i++) {
            if (i == 0 || i == pole.length -1) {
                sum += valuesMap.get(pole[i]);
            } else {

                if (valuesMap.get(pole[i]) >= valuesMap.get(pole[i+1])) {
                    sum += valuesMap.get(pole[i]);
                } else {
                    sum += valuesMap.get(pole[i+1]) - valuesMap.get(pole[i]);
                    i++;
                }
            }
        }

        return sum;
    }

}
