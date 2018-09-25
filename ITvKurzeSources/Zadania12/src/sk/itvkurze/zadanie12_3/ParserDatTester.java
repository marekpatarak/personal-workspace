package sk.itvkurze.zadanie12_3;

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
		String REGEX = "(Bc\\.|Ing\\.|Mgr\\.|Prof\\.|doc\\.|MUDr\\.)\\ [a-zA-Z]{1,}\\ [a-zA-Z]{1,}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("Mgr. Marek Patarak " + parser.splnaRegex("Mgr. Marek Patarak", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("PhDr. Marek Patarak " + parser.splnaRegex("PhDr. Marek Patarak", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("Marek Patarak " + parser.splnaRegex("Marek Patarak", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("MUDr. M P " + parser.splnaRegex("MUDr. M P", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("Ing. MP " + parser.splnaRegex("Ing. MP", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("doc. Marek Patarak  " + parser.splnaRegex("doc. Marek Patarak", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("DOC. Marek Patarak " + parser.splnaRegex("DOC. Marek Patarak", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


