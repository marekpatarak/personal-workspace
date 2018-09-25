package w3school.basic;

import java.util.Scanner;

public class CountTrailChars {

	public static void main(String[] args) {
		int n = 0;
		int countZeros = 0;
		String s;
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer for factorial:");
		n = input.nextInt();

		if (n > 20) {
			System.out.println("mimo rozsah");
		} else {

			System.out.println("Faktorial cisla " + n + " je " + IntMethods.Factorial(n));

			s = String.valueOf(IntMethods.Factorial(n));
		
			for (int i = s.length(); i > 0; i--) {
				if (s.charAt(i - 1) == '0') {
					countZeros++;
				} else
					break;
			}
		
			System.out.println("Pocet nul od konca je: " + countZeros);
		}
		

	}

}
