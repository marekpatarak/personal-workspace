package hackerman.thirtydaysofcode;

import java.util.Scanner;

public class FineCalculator {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int[][] dates = new int[2][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				dates[i][j] = scan.nextInt();
			}
		}

		System.out.println(getFine(dates));

	}

	public static int getFine(int[][] pole) {
		int fine = 0;
		int difY = pole[0][2] - pole[1][2];
		int difM = pole[0][1] - pole[1][1];
		int difD = pole[0][0] - pole[1][0];

		if (difY > 0) {
			fine = 10000;
			return fine;
		}

		if (difM > 0 && difY == 0) {
			fine = 500 * difM;
			return fine;
		}

		if (difD > 0 && difM == 0) {
			fine = 15 * difD;
			return fine;
		}

		if (difY == 0 && difM == 0 && difD <= 0) {
			fine = 0;
			return fine;
		}
		return fine;
	}

}
