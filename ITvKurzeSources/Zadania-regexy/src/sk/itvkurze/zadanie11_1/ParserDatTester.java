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

		String TESTOVACIE_DATA = "Najv��ou v�hodou �t�dia IT je pr�ve fakt, �e v IT sa vie presadi� aj mlad� �lovek."
				+ " Nemus� by� IT g�nius, ktor� u� v 16 rokoch programoval weby na mieru. M��e� by� pokojne �lovek, "
				+ "ktor�ho zauj�ma technika a IT a chcel by sa jej venova�.\r\n" + "\r\n"
				+ "Komu by sa v dne�nej dobe nep��ilo ma� dobr� plat, ma� pravideln� home office "
				+ "a vyu��va� v�etky v�hody, ktor� dnes	IT korpor�cie pon�kaj�? "
				+ "Dne�n� ve�k� IT firmy Ti rovnako pon�knu r�znepr�spevky na fitness a regener�ciu, "
				+ "zabezpe�ia Ti �pi�kov� techniku aperspekt�vne pracovn� prostredie. "
				+ "Alebo si m��e� zvoli� cestu	freelancera. \r\n"
				+ "�t�dium IT Ti otvor� dvere do ve�a odvetv�, kde sa bude� vedie� uplatni�. "
				+ "S po��ta�ov�mi kurzami od IT v kurze sa z teba m��e sta� �spe�n� Front-end developer, "
				+ "Java Developer alebo Tester		softv�rov�ch aplik�ci�. IT v kurze Ti pon�ka na v�ber poz�cie, "
				+ "ktor� s� na trhu pr�ce �iadan�. V�aka na�im kurzom sa s�ce z Teba stane len Junior, "
				+ "av�ak Tvojmu odhodlaniu a tvrdej pr�ci s� dvere otvoren� a po p�r rokov m��e� by� vo svojej firme"
				+ " IT eso.\r\n"
				+ "Nepochybne, �t�dium IT je n�ro�n� vec. Na jej konci sa v�ak nach�dza stabiln� pr�ca a "
				+ "stabiln� pr�jem, �o je nie�o, �o Ti dnes nem��e pon�knu� ka�d� segment a nie je dobr� to "
				+ "pova�ova� sa samozrejmos�.\r\n" + "\r\n"
				+ "Kurzy IT s� skuto�ne ur�en� pre v�etk�ch, ktor�	maj� odhodlanie a chc� sk�si�. "
				+ "Ak si st�le nevie� rady s t�m, �i si pre IT sektor ten prav�, kontaktuj n�s. "
				+ "Spolo�ne ur�ite n�jdeme sp�sob, aby si si to sk�sil.\r\n" + "\r\n"
				+ "Prihl�senie je nez�v�zn�, kontaktuj n�s, pom��eme Ti s v�berom, mo�no v sebe objav� nie�o, "
				+ "o �om si v�becnetu�il.";

		/**
		 * premenna typu String, pozadovany regex vo forme Stringu
		 */
		String REGEX = "�t�dium";

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


