package sk.itvkurze.zadanie12_1;

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
		String REGEX = "\\b[aeiouAEIOU][a-zA-Z]{0,}\\b";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("aZKSKakelakd " + parser.splnaRegex("aZKSKakelakd", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("sZKSKakelakd " + parser.splnaRegex("sZKSKakelakd", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println(":3?kM " + parser.splnaRegex(":3?kM", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("aJAJSE " + parser.splnaRegex("aJAJSE", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("  aJAJSE  " + parser.splnaRegex("  aJAJSE ", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("EasdrhFDA  " + parser.splnaRegex("EasdrhFDA", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("TasaeASK " + parser.splnaRegex("TasaeASK", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


