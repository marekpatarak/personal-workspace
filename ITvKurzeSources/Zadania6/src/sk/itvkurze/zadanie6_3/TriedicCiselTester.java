package sk.itvkurze.zadanie6_3;

import java.util.Scanner;

public class TriedicCiselTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Zadaj tri realne cisla (s desat. ciarkou) na vytriedenie (po kazdom cisle odenteruj)");
		MnozinaDat mnozina = new MnozinaDat(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

		mnozina.zorad();

		System.out.println("Najmensie cislo: " + mnozina.getNajmensieCislo());
		System.out.println("Prostredne cislo: " + mnozina.getProstredneCislo());
		System.out.println("Najvacsie cislo: " + mnozina.getNajvacsieCislo());

	}

}
