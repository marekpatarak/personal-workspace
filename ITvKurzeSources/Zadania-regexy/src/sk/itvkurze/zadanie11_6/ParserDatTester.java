package sk.itvkurze.zadanie11_6;

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
		String REGEX = "^\\d{2}\\w{5}\\.$";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("01abcd_. " + parser.splnaRegex("01abcd_.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("01abcd.. " + parser.splnaRegex("01abcd..", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("a1abcd_. " + parser.splnaRegex("a1abcd_.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("012345_. " + parser.splnaRegex("012345_.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("01abde_.. " + parser.splnaRegex("01abde_..", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("01_____. " + parser.splnaRegex("01_____.", REGEX));
		System.out.println("Ocakavany vystup: true");


	}
	}


