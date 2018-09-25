package sk.itvkurze.zadanie14_7;

public class Tvar {
	
	// metoda zaokruhluje vysledok na 2 desatinne miesta

	protected static double roundUp(double vstup) {
		double round = 100 * vstup;
		round = Math.round(round);
		return round / 100;
	}


}
