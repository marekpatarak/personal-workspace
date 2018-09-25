package sk.itvkurze.webinar10;

public class TriedenieRetazcov {

	public static void main(String[] args) {

		// vracia rozdiel v pozicii pismena v abecede
		System.out.println("Adam".compareTo("Marek"));
		System.out.println("Adam".compareTo("Adam"));
		System.out.println("Adam".compareTo("Beata"));

		String nazovSuboru = "zoznamStudentov.txt";
		boolean jeTextovy = nazovSuboru.endsWith(".txt");
		System.out.println("je textovy -" + jeTextovy);

		String email = "fero.hora@zoznam.sk";
		boolean spravnyPouzivatel = email.startsWith("fero.hora");
		System.out.println("spravny pouzivatel -" + spravnyPouzivatel);

		String a = "123456789 TEST 123456565";
		String b = "mmmasemasme TEST masndnfsda";
		boolean test = a.regionMatches(10, b, 12, 4);
		System.out.println(test);

		// prvy a posledny znak v retazci
		String r = "toto je jednoduchy test";
		char prvyZnak = r.charAt(0);
		char poslednyZnak = r.charAt(r.length() - 1);

		// ziskanie podretazca v retazci
		String r2 = "jeden dva";
		System.out.println(r2.substring(6, 9));

	}

}
