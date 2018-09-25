package sk.itvkurze.zadanie6_1;

import java.util.Scanner;

public class KvadratickaRovnicaTester {

	public static void main(String[] args) {
		int[] param = new int[3];

		Scanner scanner = new Scanner(System.in);

		System.out.println("vloz parametre v poradi a, b, c:");

		for (int i = 0; i < 3; i++) {
			param[i] = scanner.nextInt();
		}

		KvadratickaRovnica rovnica = new KvadratickaRovnica(param[0], param[1], param[2]);

		System.out.println("Diskriminant rovnice je : " + rovnica.getDiskriminant());
		System.out.println("Je riesitelna? : " + rovnica.jeRiesitelna());

		if (rovnica.getRiesenie1() == 0 && rovnica.getRiesenie2() == 0) {
			System.out.println("Rovnica nema riesenie v obore realnych cisel");
		} else {
			if (rovnica.getRiesenie1() == rovnica.getRiesenie2()) {
				System.out.println("Rovnica ma len 1 riesenie x1,2 = " + rovnica.getRiesenie1());
			} else {
				System.out.println("Riesenie 1 sa rovna x1 = " + rovnica.getRiesenie1());
				System.out.println("Riesenie 2 sa rovna x2 = " + rovnica.getRiesenie2());
			}
		}
	}
}

