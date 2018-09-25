package w3school.basic;

import java.util.Scanner;

public class CheckPowerOf {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer:");
		n = input.nextInt();
		System.out.println("Input an number to check:");
		m = input.nextInt();

		if (n % m == 0) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
