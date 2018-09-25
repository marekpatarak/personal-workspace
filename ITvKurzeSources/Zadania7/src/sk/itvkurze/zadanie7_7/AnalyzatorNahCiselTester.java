package sk.itvkurze.zadanie7_7;


public class AnalyzatorNahCiselTester {

	public static void main(String[] args) {

		MnozinaDat mnozina1 = new MnozinaDat();
		AnalyzatorNahodnychCisel analyzator = new AnalyzatorNahodnychCisel();

		mnozina1.generujMnozinu();

		System.out.println("Najmensia hodnota v ramci generovanej mnoziny: " + analyzator.najdiMin(mnozina1));
		System.out.println("Najvacsia hodnota v ramci generovanej mnoziny: " + analyzator.najdiMax(mnozina1));
		System.out.println("Priemerna hodnota v ramci generovanej mnoziny: " + analyzator.najdiPriemer(mnozina1));

	}

}
