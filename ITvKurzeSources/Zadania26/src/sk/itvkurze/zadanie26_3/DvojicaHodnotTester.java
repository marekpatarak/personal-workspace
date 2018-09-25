package sk.itvkurze.zadanie26_3;

public class DvojicaHodnotTester {

	public static void main(String[] args) {

		DvojicaHodnot<Boolean, Integer> dvojica = new DvojicaHodnot<Boolean, Integer>(true, 1);
		System.out.println("PRED SWAPOM");
		System.out.println("Prvy prvok: " + dvojica.getPrvyClen());
		System.out.println("Ocakavana hodnota: true");
		System.out.println("Druhy prvok: " + dvojica.getDruhyClen());
		System.out.println("Ocakavana hodnota: 1");

		DvojicaHodnot<Integer, Boolean> dvojicaSVymenenymiHodnotami = DvojicaHodnotUtil
				.vymenHodnotyParametrov(dvojica);
		System.out.println("PO SWAPE");
		System.out.println("Prvy prvok: " + dvojicaSVymenenymiHodnotami.getPrvyClen());
		System.out.println("Ocakavana hodnota: 1");
		System.out.println("Druhy prvok: " + dvojicaSVymenenymiHodnotami.getDruhyClen());
		System.out.println("Ocakavana hodnota: true");
	}

}
