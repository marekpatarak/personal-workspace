package sk.itvkurze.zadanie11_3;

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
		String REGEX = "^(\\d{3}\\D){2}\\d{5}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("123!321!12345 " + parser.splnaRegex("123!321!12345", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("1231321112345 " + parser.splnaRegex("1231321112345", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("0123!321!12345 " + parser.splnaRegex("0123!321!12345", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("123\n321\n12345 " + parser.splnaRegex("123\n321\n12345", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("a23 321 12345 " + parser.splnaRegex("a23 321 12345", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("101.000.01234 " + parser.splnaRegex("101.000.01234", REGEX));
		System.out.println("Ocakavany vystup: true");

	}
	}


