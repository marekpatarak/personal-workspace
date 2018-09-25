package sk.itvkurze.zadanie11_12;

/**
 *  import tried Matcher a Pattern potrebnych na pracu s regexami
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserDat {

	/**
	 * metoda parsujData ma za dva parametre typy String, jeden su vstupne data,
	 * druhy je regex v stringovom vyjadreni metoda vracia pocet vyskytov (matchov)
	 * daneho regexu v ramci testovacieho (vstupneho) retazca
	 */

	public static final int parsujData(String vstupneData, String regex) {

		/**
		 * inicializacia premennej pocetVyskytov na 0
		 */
		int pocetVyskytov = 0;

		/**
		 * overenie oboch parametrov vstupneData a regex ci nie su prazdne, v pripade ak
		 * niektora z podmienok je true metoda vracia aktualny pocetVyskytov = 0
		 */

		if (vstupneData == null || vstupneData.isEmpty() || regex == null || regex.isEmpty()) {
			return pocetVyskytov;
		}

		/**
		 * vytvorenie objektu triedy Pattern a jeho inicializacia skompilovanim regexu z
		 * typu String do patternu pomocou metodu compile()
		 */
		Pattern pattern = Pattern.compile(regex);

		/**
		 * vytvorenie objektu triedy Matcher a jeho inicializacia zavolanim metody
		 * matcher() nad objektom pattern s parametrom typu String vstupneData
		 */
		Matcher matcher = pattern.matcher(vstupneData);

		/**
		 * cyklus v ktorom sa vola metoda find() nad objektom matcher, ktora vracia
		 * boolean (true) v pripade ze sa nachadza vo vstupnych datach dalsi match, ak
		 * uz sa nenachadza dalsi match vracia false pri kazdom matchi sa zvysi hodnota
		 * premennej pocetVyskytov o 1
		 */

		while (matcher.find()) {
			pocetVyskytov++;
		}

		/**
		 * metoda parsujData() vracia hodnotu prem pocetVyskytov typu int
		 */
		return pocetVyskytov;
	}

	/**
	 * metoda splnaRegex() vracia hodnotu true alebo false podla toho ci regex
	 * matchuje vstupneData
	 */
	public boolean splnaRegex(String vstupneData, String regex) {
		return vstupneData.matches(regex);
	}
}
