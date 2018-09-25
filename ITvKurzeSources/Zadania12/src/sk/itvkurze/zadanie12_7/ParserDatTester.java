package sk.itvkurze.zadanie12_7;

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
		String REGEX = "o(?=aa)";

		ParserDat parser = new ParserDat();


		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("oaa " + ParserDat.parsujData("oaa", REGEX));
		System.out.println("Ocakavany vystup: 1");

		System.out.println("oaaoaa " + ParserDat.parsujData("oaaoaa", REGEX));
		System.out.println("Ocakavany vystup: 2");

		System.out.println("oa " + ParserDat.parsujData("oa", REGEX));
		System.out.println("Ocakavany vystup: 0");
	
		System.out.println("oaooaa " + ParserDat.parsujData("oaooaa", REGEX));
		System.out.println("Ocakavany vystup: 1");

		System.out.println("   aao oao oaa   " + ParserDat.parsujData("   aao oao oaa  ", REGEX));
		System.out.println("Ocakavany vystup: 1");

	}
	
	

	}


