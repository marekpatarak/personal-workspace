package sk.itvkurze.zadanie6_14;

import java.util.Scanner;

public class KonvertorJednotiekDlzkyTester {

	public static void main(String[] args) {

		String zCoho = "";
		String doCoho = "";
		double hodnota = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Zadaj z coho chces konvertovat:");
		System.out.println("mm m km palce");
		zCoho = scanner.nextLine();

		System.out.println("Zadaj do coho chces konvertovat:");
		System.out.println("mm m km palce");
		doCoho = scanner.nextLine();

		System.out.println("Zadaj hodnotu:");
		hodnota = scanner.nextInt();

		KonvertorJednotiekDlzky konvertor = new KonvertorJednotiekDlzky(zCoho, doCoho, hodnota);

		konvertor.Konvertuj();
	}


}
