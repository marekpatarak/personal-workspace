package sk.itvkurze.zadanie6_4;

import java.util.Scanner;

public class AnoNieTester {

	public static void main(String[] args) {
		String check = "OK";

		while (!check.equals("Ukoncujem program")) {
			System.out.println("Chces pokracovat?");
			Scanner scanner = new Scanner(System.in);
			AnoNie validator = new AnoNie();

			check = validator.validujVstup(scanner.nextLine());
			System.out.println(check);

		}

	}

}
