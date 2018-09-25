package sk.itvkurze.zadanie6_11;

import java.util.Scanner;

public class RealneCislaTester {

	public static void main(String[] args) {

		RealneCisla porovnavac = new RealneCisla();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vloz prve realne cislo:");
		double cislo1 = scanner.nextDouble();
		System.out.println("Vloz druhe realne cislo:");
		double cislo2 = scanner.nextDouble();

		System.out.println(
				"Po zaokruhleni sa jedna o rovnake cisla: " + porovnavac.suZhodnePoZaohkruhleni(cislo1, cislo2));
		System.out.println(
				"Cisla sa lisia o menej ako 0.01: " + porovnavac.lisiaSaOMenejAkoEpsilon(cislo1, cislo2));

	}

}
