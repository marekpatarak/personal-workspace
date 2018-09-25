package w3school.basic;

import java.util.Scanner;

public class CheckPalindrom {

	// Write a Java program to check if a positive number is a palindrome or not.

	public static void main(String[] args) {
		int n = 0;
		String s, p;
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer to check:");
		n = input.nextInt();
		s = String.valueOf(n);
		StringBuilder rev = new StringBuilder();
		rev.append(s);
		rev.reverse();
		p = rev.toString();


		if (s.equals(p)) {
			System.out.println("PALINDROM");
		} else {
			System.out.println("NOT PALINDROM");
		}
	}

}

