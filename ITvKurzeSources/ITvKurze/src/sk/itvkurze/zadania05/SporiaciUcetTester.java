package sk.itvkurze.zadania05;

public class SporiaciUcetTester {

	public static void main(String[] args) {
		SporiaciUcet novySporUcet = new SporiaciUcet(1000, 10);
		System.out.println("Stav sporiaceho uctu je: " + novySporUcet.getStavUctu());
		System.out.println("Ocakavany stav uctu je: 1000");

		// urocenie sadzbou 10 perc
		novySporUcet.zapisUrok();
		novySporUcet.zapisUrok();
		novySporUcet.zapisUrok();
		novySporUcet.zapisUrok();
		novySporUcet.zapisUrok();

		// stav uctu po uroceni
		System.out.println("Stav sporiaceho uctu po uroceni je: " + novySporUcet.getStavUctu());
		System.out.println("Ocakavny stav sporiaceho uctu po uroceni je: 1610.51");

	}

}
