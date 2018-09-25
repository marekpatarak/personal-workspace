package sk.itvkurze.zadanie11_2;

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
		String REGEX = "^(...\\.){4}.{3}$";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("123.123.123.123.123 " + parser.splnaRegex("123.123.123.123.123", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("0123.123.123.123.123 " + parser.splnaRegex("0123.123.123.123.123", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("abc.abg.amn.opq.rrt " + parser.splnaRegex("abc.abg.amn.opq.rrt", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("321.321.321.321.321.321 " + parser.splnaRegex("321.321.321.321.321.321", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("................... " + parser.splnaRegex("...................", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("....................... " + parser.splnaRegex(".......................", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("123.123.123.123.1234 " + parser.splnaRegex("123.123.123.123.1234", REGEX));
		System.out.println("Ocakavany vystup: false");
	}
	}


