package sk.theory.strings;

public class Strings {

	// metoda pocetnost() vracia pocet vyskytov podretazca v retazci
	private static int pocetnost (String retazec, String hladanyPodretazec) {
		
		if (retazec == null || retazec.isEmpty() || hladanyPodretazec == null || hladanyPodretazec.isEmpty())
			;
		int pocetVyskytov = 0;
		
		for (int i = 0; (i = retazec.indexOf(hladanyPodretazec, i)) != -1; pocetVyskytov++) {
			i +=hladanyPodretazec.length();
		}
		return pocetVyskytov++;
	}

	// metoda vratPodretazecPred() vracia podretazec pred oddelovacom

	private static String vratPodretazecPred(String retazec, String oddelovac) {
		int pozicia = retazec.indexOf(oddelovac);

		return pozicia >= 0 ? retazec.substring(0, pozicia) : retazec;
	}

	private static String vratPodretazecZa(String retazec, String oddelovac) {
		int pozicia = retazec.indexOf(oddelovac);

		return pozicia >= 0 ? retazec.substring(pozicia + oddelovac.length()) : retazec;
	}

	public static void main(String[] args) {
		String str = "somethings";

		// contains() check ci obsahuje CharSequence
		System.out.println(str.contains("some")); // true
		System.out.println(str.contains("tohoe")); // false

		// equals() chech ci sa zhoduje
		System.out.println(str.equals("somethings")); // true
		System.out.println(str.contains("Somethings")); // false

		// equals() chech ci sa zhoduje nezavisle na case
		System.out.println(str.equalsIgnoreCase("Somethings")); // true

		// indexOf() prvy vyskyt znaku/podretazca v retazci
		System.out.println(str.indexOf('s')); // 0

		// dalsi vyskyt od indexu prveho vyskytu znaku/podretazca
		System.out.println(str.indexOf('s', str.indexOf('s' + 1))); // 9

		// lastIndexOf() posledny vyskyt znaku/podretazca v retazci
		System.out.println(str.lastIndexOf('s')); // 9

		// test metody pocetnost()
		System.out.println(pocetnost("kokot", "ko")); // expected 2

		String a = new String("test");
		String b = new String("test");

		// referencia a ukazuje na rovnaky objekt ako referencia b
		// objekt je v heape iba jeden lebo je to string a je rovnaky

		if (a == b) {
			System.out.println("referencia a== referencia b");
		}

		// porovnanie obsahu objektu

		if (a.equals(b)) {
			System.out.println("objekt a equals objekt b");
		}

		// porovnanie stringov lexikograficky (podla abecedy)
		System.out.println("Adam".compareTo("Beata"));
		// male pismena su pred velkymi
		System.out.println("adam".compareTo("Beata"));

		// test koncoveho substringu
		String nazov = "zoznam.txt";
		System.out.println(nazov.endsWith("txt")); // expected true
		System.out.println(nazov.startsWith("txt")); // expected false

		// test metody vratPodretazecPred a vratPodretazecZa
		String oddel = "test";
		String vstup = "kokos test panis";

		System.out.println(vratPodretazecPred(vstup, oddel));
		System.out.println(vratPodretazecZa(vstup, oddel));

		// spajanie retazcov
		System.out.println(vstup.concat(" ").concat(oddel));
		System.out.println(vstup + " " + oddel);

		// orezanie whitespacov
		System.out.println("          kokosty           ".trim());

	}
}
