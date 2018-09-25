package sk.itvkurze.zadanie6_5;

import java.util.Scanner;

public class AkostTovaruTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AkostTovaru akost = new AkostTovaru();

		System.out.println("Vloz stupen akosti:");

		akost.vypisStupenAkostiTovaru(scanner.nextLine());

	}

}
