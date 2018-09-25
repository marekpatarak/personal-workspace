package sk.itvkurze.zadanie6_6;

import java.util.Scanner;

public class AkostTovaruTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AkostTovaru akost = new AkostTovaru();

		System.out.println("Vloz stupen akosti (v ciselnom vyjadreni):");
		double priemAkost = scanner.nextDouble();
		System.out.println("Akost tovaru je: " + akost.getAkostTovaru(priemAkost));

	}

}
