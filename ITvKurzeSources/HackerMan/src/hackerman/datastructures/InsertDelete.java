package hackerman.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDelete {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> data = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			data.add(scan.nextInt());
		}

		int q = scan.nextInt();
		int index;
		int elem;
		StringBuilder strb = new StringBuilder();

		for (int i = 1; i <= q; i++) {
			scan.nextLine();
			String oper = scan.nextLine();
			if (oper.equals("Insert")) {
				index = scan.nextInt();
				elem = scan.nextInt();
				data.add(index, elem);
			}
			if (oper.equals("Delete")) {
				index = scan.nextInt();
				data.remove(index);
			}
			strb.append(oper);
			strb.append("\n");

		}

		System.out.println(n);
		System.out.println(q);
		System.out.print(strb.toString());

		for (Integer prvok : data) {
			System.out.print(prvok + " ");
		}
	}

}
