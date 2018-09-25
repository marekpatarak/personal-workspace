package sk.itvkurze.zadanie12_2;

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
		String REGEX = "(?:test){3,}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("testtesttest " + parser.splnaRegex("testtesttest", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("test " + parser.splnaRegex("test", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("test testtest " + parser.splnaRegex("test testtest", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("testtesttesttest " + parser.splnaRegex("testtesttesttest", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("TestTestTest " + parser.splnaRegex("TestTestTest", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("testtesttesttesttest  " + parser.splnaRegex("testtesttesttesttest", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("testtesTTesttest " + parser.splnaRegex("testtesTTesttest", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


