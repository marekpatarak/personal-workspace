package sk.itvkurze.zadanie6_2;

import java.util.Scanner;

public class RozpoznavacKarietTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj skrateny popis karty: ");
		Karta karta = new Karta(scanner.nextLine());

		System.out.println(karta.getFullPopis());

	}

}
