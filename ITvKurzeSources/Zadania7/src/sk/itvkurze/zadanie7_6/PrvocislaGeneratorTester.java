package sk.itvkurze.zadanie7_6;

import java.util.Scanner;

public class PrvocislaGeneratorTester {

	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		PrvocislaGenerator pGenerator = new PrvocislaGenerator();

		System.out.println("Vloz rozsah na hladanie prvocisel N:");
		n = scanner.nextInt();
		pGenerator.najdiPrvocisla(n);
	}

}
