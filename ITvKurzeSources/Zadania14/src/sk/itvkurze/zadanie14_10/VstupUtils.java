package sk.itvkurze.zadanie14_10;

import java.util.Scanner;

public class VstupUtils {

	public static int nacitajCeleCislo(Scanner vstup, String sprava, String chyba, int dolHranica, int horHranica) {

		int vek = -1;

		while (vek < dolHranica || vek > horHranica) {
			System.out.println(sprava);
			vek = vstup.nextInt();

			if (vek < dolHranica || vek > horHranica) {
				System.out.println(chyba);
			} else {
				return vek;
			}

		}
		return 0;
	}
}
