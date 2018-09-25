package sk.itvkurze.zadanie7_1;

import java.util.Scanner;

public class ZmenarenTester {

	public static void main(String[] args) {

		String check = "";
		Scanner scanner = new Scanner(System.in);
		Zmenaren zmenaren = new Zmenaren();
		
		System.out.println("Kolko eur aktualne dostaneme za jeden dolar?");
		zmenaren.setKurz(scanner.nextDouble());
		
		while (!(check.equalsIgnoreCase("Q"))) {
			
			System.out.println("Suma v dolaroch (Q - ukonc. program)");
			check = scanner.next();
			
			if (!(check.equalsIgnoreCase("Q"))) {
				zmenaren.zamen(Double.valueOf(check));

			} else
				System.out.println("Ukoncujem program");
		}
	}
}