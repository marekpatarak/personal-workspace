package sk.itvkurze.zadanie11_11;

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
		String REGEX = "^\\d{1,2}[a-zA-Z]{4,}\\.{0,4}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println(
				"0abcdABCDaasdfasdfDDDfdfdnvcvnre " + parser.splnaRegex("0abcdABCDaasdfasdfDDDfdfdnvcvnre", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("0abcdABCD, " + parser.splnaRegex("0abcdABCD,", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("0abcdABCDasdfasfd..... " + parser.splnaRegex("0abcdABCDasdfasfd.....", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("0abcdABCD.... " + parser.splnaRegex("0abcdABCD....", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("0abcdABC_. " + parser.splnaRegex("0abcdABC_.", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("01abcdABCDaaaa.. " + parser.splnaRegex("01abcdABCDaaaa..", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("011abcdABCD " + parser.splnaRegex("011abcdABCD", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


