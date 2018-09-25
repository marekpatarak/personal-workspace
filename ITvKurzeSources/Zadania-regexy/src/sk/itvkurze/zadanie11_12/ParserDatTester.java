package sk.itvkurze.zadanie11_12;

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
		String REGEX = "^\\d{2,}[a-z]{0,}[A-Z]{0,}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("01 " + parser.splnaRegex("01", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("abcABC " + parser.splnaRegex("abcABC", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("0!abcABC. " + parser.splnaRegex("0!abcABC.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("1ASFASDFASDF " + parser.splnaRegex("1ASFASDFASDF", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("111 " + parser.splnaRegex("111", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("99asdfa " + parser.splnaRegex("99asdfa", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("1ASDFASDFasdf " + parser.splnaRegex("1ASDFASDFasdf", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


