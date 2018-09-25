package sk.itvkurze.zadanie7_4;

import java.util.Scanner;

public class FibonaciGeneratorTester {

	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		FibonaciGenerator fGenerator = new FibonaciGenerator();

		System.out.println("Vloz poradove cislo pozadovaneho clena Fibonaciho postupnosti N:");
		n = scanner.nextInt();
		System.out
				.println("Pozadovany clen Fibonaciho postupnosti je (N = " + n + "): " + fGenerator.generujNteCislo(n));
	}

}
