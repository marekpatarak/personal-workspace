package sk.itvkurze.zadania05;

public class BankovyUcetTestKonstrukt {

	public static void main(String[] args) {
		BankovyUcet ucetBezVkladu = new BankovyUcet();
		BankovyUcet ucetSVkladom = new BankovyUcet(1000);

		System.out.println("Stav uctu zalozeneho bez pociatocneho vkladu: " + ucetBezVkladu.getStavUctu());
		System.out.println("Stav uctu zalozeneho s pociat. vkladom 1000 EUR: " + ucetSVkladom.getStavUctu());

	}

}
