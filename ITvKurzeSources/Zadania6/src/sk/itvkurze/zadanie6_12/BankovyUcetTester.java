package sk.itvkurze.zadanie6_12;

public class BankovyUcetTester {

	public static void main(String[] args) {
		BankovyUcet novyUcet = new BankovyUcet();
		System.out.println("Stav uctu je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu je: 10");
		System.out.println("Celkovy pocet transakcii:" + novyUcet.getPocetTrans());
		System.out.println();

		// vklad na novyUcet 1000 EUR a zauctovanie poplatku
		novyUcet.vkladUcet(1000);
		System.out.println("Stav uctu po vklade je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu po vklade je: 1009");
		System.out.println("Celkovy pocet transakcii: " + novyUcet.getPocetTrans());
		System.out.println();

		novyUcet.vkladUcet(-1000);
		System.out.println("Stav uctu po vklade je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu po vklade je: 1009");
		System.out.println("Celkovy pocet transakcii: " + novyUcet.getPocetTrans());
		System.out.println();

		novyUcet.vyberUcet(-1000);
		System.out.println("Stav uctu po vybere je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu po vybere je: 1009");
		System.out.println("Celkovy pocet transakcii: " + novyUcet.getPocetTrans());
		System.out.println();

		novyUcet.vkladUcet(0);
		System.out.println("Stav uctu po vklade je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu po vklade je: 1009");
		System.out.println("Celkovy pocet transakcii: " + novyUcet.getPocetTrans());
		System.out.println();

		novyUcet.vyberUcet(0);
		System.out.println("Stav uctu po vybere je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu po vybere je: 1009");
		System.out.println("Celkovy pocet transakcii: " + novyUcet.getPocetTrans());
		System.out.println();

		novyUcet.vyberUcet(2000);
		System.out.println("Stav uctu po vybere je: " + novyUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu po vybere je: 1009");
		System.out.println("Celkovy pocet transakcii: " + novyUcet.getPocetTrans());
		System.out.println();

	}

}
