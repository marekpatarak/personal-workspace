package sk.itvkurze.zadanie11_10;

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
		String REGEX = "^([a-zA-Z]|[02468]){40}(\\s|[13579]){5}$";

		ParserDat parser = new ParserDat();

		/**
		 * testovanie celej testovacej mnoziny vstupov a vypisanie ocakavanych a
		 * skutocnych hodnot
		 */
		System.out.println("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 1 35 "
				+ parser.splnaRegex("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 1 35", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 1 35_ "
				+ parser.splnaRegex("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 1 35_", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 2 35 "
				+ parser.splnaRegex("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 2 35", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n "
				+ parser.splnaRegex("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n22222 "
				+ parser.splnaRegex("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n22222", REGEX));
		System.out.println("Ocakavany vystup: false");

		System.out.println("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n13579 "
				+ parser.splnaRegex("aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n13579", REGEX));
		System.out.println("Ocakavany vystup: true");

		System.out.println("1aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 1 35 "
				+ parser.splnaRegex("1aA0bB0cC2dD2eE4fF4gG6hH6iI8jJ8kK0lL0mM2n 1 35", REGEX));
		System.out.println("Ocakavany vystup: false");

	}
	}


