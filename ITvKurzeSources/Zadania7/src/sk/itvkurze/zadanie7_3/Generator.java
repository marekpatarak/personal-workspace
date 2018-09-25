package sk.itvkurze.zadanie7_3;

public class Generator {

	public void generuj(int cislo, int faktor) {

		for (int i = 0; i <= faktor; i++) {
			System.out.println(Math.pow(cislo, i));

		}
	}
}
