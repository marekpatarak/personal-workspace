package sk.itvkurze.zadanie11_9;

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
		String REGEX = "^[a-z][0-9][^a-z][^A-Z][A-Z]";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("a3?kM " + parser.splnaRegex("a3?kM", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("a3?k% " + parser.splnaRegex("a3?k%", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println(":3?kM " + parser.splnaRegex(":3?kM", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("x9Q_C " + parser.splnaRegex("x9Q_C", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("xaQ_C " + parser.splnaRegex("xaQ_C", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("b7!bB " + parser.splnaRegex("b7!bB", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("b7!bBab1%?:%\n. " + parser.splnaRegex("b7!bBab1%?:%\\n.", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println(ParserDat.parsujData("b7!bBab1%?:%\\n.", REGEX));

	}
	}


