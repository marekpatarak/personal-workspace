package sk.itvkurze.zadanie11_14;

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
		String REGEX = "^[A-Za-z]*\\.{1}$";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println(". " + parser.splnaRegex(".", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("aB " + parser.splnaRegex("aB", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("aB0. " + parser.splnaRegex("aB0.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("avASFva. " + parser.splnaRegex("avASFva.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("_aB. " + parser.splnaRegex("_aB.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("BBBBBB. " + parser.splnaRegex("BBBBBB.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("aaaa.. " + parser.splnaRegex("aaaa..", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


