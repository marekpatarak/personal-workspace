package hackerman.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrListProblem {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 * 
		 * TEST INPUT 5 5 41 77 74 22 44 1 12 4 37 34 36 52 0 3 20 22 33 5 1 3 3 4 3 1 4
		 * 3 5 5
		 */
		Scanner scan = new Scanner(System.in);
		int n = Integer.valueOf(scan.nextLine());
		List<Integer[]> data = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			int len = scan.nextInt();
			Integer[] pole = new Integer[len];
			for (int j = 0; j < pole.length; j++) {
				pole[j] = scan.nextInt();
			}
			data.add(pole);
		}

		int q = scan.nextInt();
		List<Integer[]> queries = new ArrayList<>();

		for (int i = 1; i <= q; i++) {
			Integer[] pole = new Integer[2];
			for (int j = 0; j < pole.length; j++) {
				pole[j] = scan.nextInt();
			}
			queries.add(pole);
		}

		System.out.println(n);
		System.out.println(q);

		for (Integer[] pole : queries) {
			try {
				System.out.println(data.get(pole[0] - 1)[pole[1] - 1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("ERROR!");
			}
		}

	}
}
