package sk.itvkurze.zadanie14_10;

import java.util.Scanner;

public class VstupUtilsTester {

	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		int vek = VstupUtils.nacitajCeleCislo(vstup, "Prosim zadaj vek", "Chybny vstup:", 1, 150);

		System.out.println("Nasledujuci rok budes o rok starsi a budes mat " + (++vek) + " rokov");
	}

}
