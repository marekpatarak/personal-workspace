package sk.itvkurze.zadanie7_7;

public class AnalyzatorNahodnychCisel {

	public int najdiMax(MnozinaDat mnozina) {
		int max = mnozina.pole[0];

		for (int i = 0; i < 100; i++) {
			if (mnozina.pole[i] > max) {
				max = mnozina.pole[i];
			}
		}
		return max;
	}

	public int najdiMin(MnozinaDat mnozina) {
		int min = mnozina.pole[0];

		for (int i = 0; i < 100; i++) {
			if (mnozina.pole[i] < min) {
				min = mnozina.pole[i];
			}
		}
		return min;
	}

	public double najdiPriemer(MnozinaDat mnozina) {
		int sucet = 0;

		for (int i = 0; i < 100; i++) {
			sucet += mnozina.pole[i];
		}

		return sucet / 100;
	}
}
