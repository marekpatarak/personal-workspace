package hackerman.java;

import java.util.Scanner;

public class LoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = 1;
		for (int i = 0; i < t; i++) {
			int a = 0;
			int b = 2;
			int n = 10;
			Metoda.vypisVysledok(a, b, n);
		}
		in.close();

	}

}

class Metoda {
	public static void vypisVysledok(int a, int b, int n) {

		StringBuilder str = new StringBuilder();
		Double clen = 0d;
		for (int i = 0; i < n; i++) {

			if (i == 0) {
				clen = (a + (Math.pow(2, i) * b));
			} else {
				clen += (Math.pow(2, i) * b);
			}
			str.append(clen.intValue()).append(" ");

		}
		System.out.println(str.toString());

	}

	}
