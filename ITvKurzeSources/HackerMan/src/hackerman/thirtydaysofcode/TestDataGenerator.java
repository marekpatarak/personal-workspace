package hackerman.thirtydaysofcode;

import java.util.Random;

public class TestDataGenerator {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Random random = new Random();
		int t = random.nextInt(4) + 1;
		int n, k;
		System.out.println(t);
		for (int i = 1; i <= t; i++) {
			n = random.nextInt(198) + 3;
			k = random.nextInt(n) + 1;
			System.out.println(n + " " + k);

			for (int j = 1; j <= n; j++) {
				System.out.print((random.nextInt(2001) - 1000) + " ");
			}
		}
	}
}
