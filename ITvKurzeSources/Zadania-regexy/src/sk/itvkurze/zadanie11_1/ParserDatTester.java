package sk.itvkurze.zadanie11_1;

/**
 * testovacia trieda ParserDatTester
 */

public class ParserDatTester {

	/**
	 * metoda main
	 */

	public static void main(String[] args) {

		/**
		 * premenna typu String, testovacie data/retazec
		 */

		String TESTOVACIE_DATA = "Najväèšou vıhodou štúdia IT je práve fakt, e v IT sa vie presadi aj mladı èlovek."
				+ " Nemusíš by IT génius, ktorı u v 16 rokoch programoval weby na mieru. Môeš by pokojne èlovek, "
				+ "ktorého zaujíma technika a IT a chcel by sa jej venova.\r\n" + "\r\n"
				+ "Komu by sa v dnešnej dobe nepáèilo ma dobrı plat, ma pravidelnı home office "
				+ "a vyuíva všetky vıhody, ktoré dnes	IT korporácie ponúkajú? "
				+ "Dnešné ve¾ké IT firmy Ti rovnako ponúknu rôznepríspevky na fitness a regeneráciu, "
				+ "zabezpeèia Ti špièkovú techniku aperspektívne pracovné prostredie. "
				+ "Alebo si môeš zvoli cestu	freelancera. \r\n"
				+ "Štúdium IT Ti otvorí dvere do ve¾a odvetví, kde sa budeš vedie uplatni. "
				+ "S poèítaèovımi kurzami od IT v kurze sa z teba môe sta úspešnı Front-end developer, "
				+ "Java Developer alebo Tester		softvérovıch aplikácií. IT v kurze Ti ponúka na vıber pozície, "
				+ "ktoré sú na trhu práce iadané. Vïaka našim kurzom sa síce z Teba stane len Junior, "
				+ "avšak Tvojmu odhodlaniu a tvrdej práci sú dvere otvorené a po pár rokov môeš by vo svojej firme"
				+ " IT eso.\r\n"
				+ "Nepochybne, štúdium IT je nároèná vec. Na jej konci sa však nachádza stabilná práca a "
				+ "stabilnı príjem, èo je nieèo, èo Ti dnes nemôe ponúknu kadı segment a nie je dobré to "
				+ "povaova sa samozrejmos.\r\n" + "\r\n"
				+ "Kurzy IT sú skutoène urèené pre všetkıch, ktorí	majú odhodlanie a chcú skúsi. "
				+ "Ak si stále nevieš rady s tım, èi si pre IT sektor ten pravı, kontaktuj nás. "
				+ "Spoloène urèite nájdeme spôsob, aby si si to skúsil.\r\n" + "\r\n"
				+ "Prihlásenie je nezáväzné, kontaktuj nás, pomôeme Ti s vıberom, mono v sebe objavíš nieèo, "
				+ "o èom si vôbecnetušil.";

		/**
		 * premenna typu String, pozadovany regex vo forme Stringu
		 */
		String REGEX = "štúdium";

		/**
		 * inicializacia prem typu int pocetVyskytov, zavolanim metody parsujData() z
		 * triedy ParserDat, s parametrami testovacie data/retazec a regex vo forme
		 * stringu
		 */
		int pocetVyskytov = ParserDat.parsujData(TESTOVACIE_DATA, REGEX);

		/**
		 * vypisanie hodnoty prem pocetVyskytov po zavolani metody parsujData() na
		 * standardny vystup a zadaneho regexu
		 */
		System.out.println("Vstupne data obsahuju: " + pocetVyskytov + " vyskyt regularneho vyrazu '" + REGEX + "'.");
		System.out.println("Ocakavany vystup: 1");
	}
	}


