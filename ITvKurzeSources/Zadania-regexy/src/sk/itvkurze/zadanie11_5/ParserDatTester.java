package sk.itvkurze.zadanie11_5;

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
		String REGEX = "\\w{3}\\W\\w{10}\\W\\w{4}";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("101 1234567890 1234 " + parser.splnaRegex("101 1234567890 1234", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("101 1234567890_1234 " + parser.splnaRegex("101 1234567890_1234", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("101 1234567890 12345 " + parser.splnaRegex("101 1234567890 12345", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("abc\nabcdefghij\n1234 " + parser.splnaRegex("abc\nabcdefghij\n1234", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("1a1_1b23244333_?<13 " + parser.splnaRegex("1a1_1b23244333_?<13", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("101.1234567890.1234 " + parser.splnaRegex("101.1234567890.1234", REGEX));
		System.out.println("Ocakavany vystup: true");


	}
	}


