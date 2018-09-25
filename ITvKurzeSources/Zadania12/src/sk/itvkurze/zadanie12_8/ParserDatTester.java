package sk.itvkurze.zadanie12_8;

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
		String REGEX = "(?<=[13579])\\d";

		ParserDat parser = new ParserDat();


		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("12345678 " + ParserDat.parsujData("12345678", REGEX));
		System.out.println("Ocakavany vystup: 4");

		System.out.println("00000005 " + ParserDat.parsujData("00000005", REGEX));
		System.out.println("Ocakavany vystup: 0");

		System.out.println("3223478 " + ParserDat.parsujData("3223478", REGEX));
		System.out.println("Ocakavany vystup: 3");
	
		System.out.println("3333333 " + ParserDat.parsujData("3333333", REGEX));
		System.out.println("Ocakavany vystup: 6");

		System.out.println("7 2 75 29 75   " + ParserDat.parsujData("7 2 75 29 75", REGEX));
		System.out.println("Ocakavany vystup: 2");

	}
	
	

	}


