package sk.itvkurze.webinar14;

public class PokladnaTester {

	public static void main(String[] args) {
		Pokladna pokladna = new Pokladna();
		pokladna.vypisSumar();
		System.out.println("-------");
		Tovar tovar1 = new Tovar("znacka1", "typ1", 56);
		Tovar tovar2 = new Tovar("znacka2", "typ2", 1231);

		// NAKUP 1(velky) ------------------------------
		System.out.println("velky NAKUP 1");

		for (int i = 0; i < 100; i++) {
			pokladna.nacitajTovar(tovar1);
			pokladna.nacitajTovar(tovar2);
		}

		System.out.println("------");
		pokladna.zaplat(290, 10, 2, 4, 5, 4, 2, 1, 5);

		// NAKUP 2(maly)---------------------------------------------------------
		System.out.println("--------------------------");
		System.out.println("maly NAKUP 2");
		pokladna.nacitajTovar(tovar1);
		pokladna.nacitajTovar(tovar2);
		pokladna.vypisObsahKosika();
		pokladna.zaplat(2, 10, 0, 0, 0, 0, 0, 0, 0);


		// NAKUP 3 test
		System.out.println("--------");
		System.out.println("NAKUP 3");
		System.out.println("--------");

		pokladna.nacitajTovar(tovar1);
		pokladna.zaplat(1, 0, 0, 0, 0, 0, 0, 0, 0);

		pokladna.vypisSumar();
	}

}
