package sk.itvkurze.zadanie6_13;

import java.util.Scanner;

public class VyplataTester {

	public static void main(String[] args) {

		double hodMzda = 0;
		double odpracHod = 0;
		boolean check = true;

		Scanner scanner = new Scanner(System.in);

		while (check == true) {
		System.out.println("Zadaj hodinovu mzdu:");
		hodMzda = scanner.nextDouble();
		System.out.println("Zadaj odpracovane hodiny:");
		odpracHod = scanner.nextDouble();

			if (hodMzda < 0 || odpracHod < 0) {
				System.out.println("Niektory z udajov bol zaporny, zadaj znovu");
			} else
				check = false;
		}

		Vyplata brigadnik = new Vyplata(hodMzda, odpracHod);

		System.out.println("Vyplata za minuly tyzden je: " + brigadnik.getVyplata());
	}

}
