package sk.marek.learn2code;
import java.util.Scanner;

public class Konverzie {
    public static void main(String[] args) {

        int input;
        int typ_konverzie=0;
        int [] typ_konverzie_pole = {1,2};
        boolean a;

        Scanner scan = new Scanner(System.in);

        System.out.println("Vyber konverziu:");
        System.out.println("- pre konverziu z decimalneho do binarneho zadaj 1");
        System.out.println("- pre konverziu z decimalneho do hex zadaj 2");
        typ_konverzie = scan.nextInt();

        a = contains(typ_konverzie_pole, typ_konverzie);
        System.out.println(a);

    while (a == false) {
            System.out.println("Nespravny typ konverzie, vloz znovu");
            typ_konverzie = scan.nextInt();
            a = contains(typ_konverzie_pole, typ_konverzie);
        }

            if (typ_konverzie == typ_konverzie_pole[0]) {
                System.out.println("Vloz cislo na konverziu:");
                input = scan.nextInt();
                DecToBin(input);

            } else
                if (typ_konverzie == typ_konverzie_pole[1]) {
                    System.out.println("Vloz cislo na konverziu:");
                    input = scan.nextInt();
                    DecToHex(input);

            }
        }

    public static boolean contains(int[] array, int key) {
            for (int i = 0 ; i < array.length; i++) {
                if (array[i] == key) {
                    return true;
                }
            }
            return false;
        }

    public static void DecToBin(int input) {

        int quot = input, i = 1, j;
        int bin_num[] = new int[100];

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--)
            System.out.print(bin_num[j]);
    }

    public static void DecToHex(int input) {

        int dec_num = input, rem;
        String hexdec_num="";

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (dec_num > 0) {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num /16;
            }

        System.out.print("Hexadecimal number is: " + hexdec_num);

    }
}

