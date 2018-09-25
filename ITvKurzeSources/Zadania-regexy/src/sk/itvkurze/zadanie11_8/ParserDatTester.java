package sk.itvkurze.zadanie11_8;

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
		String REGEX = "^[^0-9][^aeiou][^xym][^bcMG][^\\s][^AEIOU][^.,]$";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("a0cN0a! " + parser.splnaRegex("a0cN0a!", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("a0cN0a. " + parser.splnaRegex("a0cN0a.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("00cN0a! " + parser.splnaRegex("00cN0a!", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("_AqNkb? " + parser.splnaRegex("_AqNkb?", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("_AqNkb, " + parser.splnaRegex("_AqNkb,", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("22m/8_, " + parser.splnaRegex("22m/8_,", REGEX));
		System.out.println("Ocakavany vystup: false");


	}
	}


