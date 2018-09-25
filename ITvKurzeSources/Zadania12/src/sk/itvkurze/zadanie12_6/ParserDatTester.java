package sk.itvkurze.zadanie12_6;

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
		String REGEX = "^(\\d{2})(?|(:)|(\\.)|(---)|(-))(\\d{2}\\2){2}(\\d{2})$";

		ParserDat parser = new ParserDat();


		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("22-11-33-44 " + parser.splnaRegex("22-11-33-44", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("11223344 " + parser.splnaRegex("11223344", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("32:11:11:22 " + parser.splnaRegex("32:11:11:22", REGEX));
		System.out.println("Ocakavany vystup: true");
	
		System.out.println("32:11:11-22 " + parser.splnaRegex("32:11:11-22", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("11---11---33---44 " + parser.splnaRegex("11---11---33---44", REGEX));
		System.out.println("Ocakavany vystup: true");

	}
	
	

	}


