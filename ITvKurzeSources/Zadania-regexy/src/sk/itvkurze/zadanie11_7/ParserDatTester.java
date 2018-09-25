package sk.itvkurze.zadanie11_7;

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
		String REGEX = "^[123][0123][xym]\\/[789]_[.,]$";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("10x/7_. " + parser.splnaRegex("10x/7_.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("10x/7_.. " + parser.splnaRegex("10x/7_..", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("10x/77_ " + parser.splnaRegex("10x/77_", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("33y/9_. " + parser.splnaRegex("33y/9_.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("90x/7_. " + parser.splnaRegex("90x/7_.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("22m/8_, " + parser.splnaRegex("22m/8_,", REGEX));
		System.out.println("Ocakavany vystup: true");


	}
	}


