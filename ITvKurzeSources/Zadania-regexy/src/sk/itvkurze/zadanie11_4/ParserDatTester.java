package sk.itvkurze.zadanie11_4;

/**
 * testovacia trieda ParserDatTester
 */

public class ParserDatTester {

	/**
	 * metoda main
	 */

	public static void main(String[] args) {

		/**
		 * premenna typu String, pozadovany regex vo forme Stringu
		 */
		String REGEX = "(\\S{2}\\s){3}\\S{2}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("10 20 30 40 " + parser.splnaRegex("10 20 30 40", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("10 23 30 401 " + parser.splnaRegex("10 23 30 401", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("10 20 30 \n40 " + parser.splnaRegex("10 20 30\n40", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("123 123 123 123 " + parser.splnaRegex("123 123 123 123", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println(".. .. .. .. .. " + parser.splnaRegex(".. .. .. .. ..", REGEX));
		System.out.println("Ocakavany vystup: true");


	}
	}


