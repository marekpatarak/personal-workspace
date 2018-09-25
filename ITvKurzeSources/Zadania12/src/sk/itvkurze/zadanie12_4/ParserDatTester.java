package sk.itvkurze.zadanie12_4;

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
		String REGEX = "([a-z])([word])(\\s)([^word])(\\d)(\\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10";

		ParserDat parser = new ParserDat();


		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("cw t8'GyI]cw t8'GyI] " + parser.splnaRegex("cw t8'GyI]cw t8'GyI]", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("cw t8'GyI]cw t8'GyI]G " + parser.splnaRegex("cw t8'GyI]cw t8'GyI]G", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("od 98PVVo&od 98PVVo& " + parser.splnaRegex("od 98PVVo&od 98PVVo&", REGEX));
		System.out.println("Ocakavany vystup: true");
	
		System.out.println("od 98PVVo&od%98PVVo& " + parser.splnaRegex("od 98PVVo&od%98PVVo&", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("od 98PVVo&od 98PVVo& " + parser.splnaRegex("od 98PVVo&od 98PVVo&", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("   od 98PVVo&od 98PVVo&    " + parser.obsahujeRegex("   od 98PVVo&od 98PVVo&   ", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("12345od 98PVVo&od 98PVVo&    " + parser.obsahujeRegex("12345od 98PVVo&od 98PVVo&", REGEX));
		System.out.println("Ocakavany vystup: true");
	}
	
	

	}


