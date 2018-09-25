package sk.itvkurze.zadanie11_13;

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
		String REGEX = "^\\d+[A-Z]+[a-z]+";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("011111Aa " + parser.splnaRegex("011111Aa", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("011111aA " + parser.splnaRegex("011111aA", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("AAAAAAa " + parser.splnaRegex("AAAAAAa", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("0Aa " + parser.splnaRegex("0Aa", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("011111 " + parser.splnaRegex("011111", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("1ABCabc " + parser.splnaRegex("1ABCabc", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("011111aaaa " + parser.splnaRegex("011111aaaa", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


