package w3school.basic;

import java.util.Scanner;

public class CalcSqRoot {

	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer:");
		n = input.nextInt();
		System.out.println("Square root of an input is: " + Math.sqrt(n));
	}

}
