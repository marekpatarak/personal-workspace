package sk.itvkurze.zadanie12_5;

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
		String REGEX = "^([a-fA-F0-9]){2}([:-]?)(([a-fA-F0-9]){2}\\2){4}([a-fA-F0-9]){2}$";

		ParserDat parser = new ParserDat();


		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("FF-FF-FF-FF-FF-FF " + parser.splnaRegex("FF-FF-FF-FF-FF-FF", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("F-F-11-22-33-44-55 " + parser.splnaRegex("F-F-11-22-33-44-55", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("00-11-22-33-44-55 " + parser.splnaRegex("00-11-22-33-44-55", REGEX));
		System.out.println("Ocakavany vystup: true");
	
		System.out.println("12-34-56789011 " + parser.splnaRegex("12-34-56789011", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("112233445566 " + parser.splnaRegex("112233445566", REGEX));
		System.out.println("Ocakavany vystup: true");

	}
	
	

	}


