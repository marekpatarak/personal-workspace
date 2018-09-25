package sk.itvkurze.zadanie6_8;

import java.util.Scanner;

public class KalkulackaDaneTester {

	public static void main(String[] args) {

		double prijem;
		String stav;
		Scanner scanner = new Scanner(System.in);
		KalkulackaDane kalkulacka = new KalkulackaDane();

		System.out.println("Vloz svoj prijem: ");
		prijem = scanner.nextDouble();
		System.out.println("Uved stav (slobodny/slobodna) alebo (zenaty/vydata): ");
		stav = scanner.next();

		System.out.println("Vyska dane je: " + kalkulacka.getDan(prijem, stav));

	}

}
