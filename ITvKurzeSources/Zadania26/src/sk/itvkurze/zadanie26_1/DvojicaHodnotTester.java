package sk.itvkurze.zadanie26_1;

public class DvojicaHodnotTester {

	public static void main(String[] args) {

		DvojicaHodnot<Integer> dvojica = new DvojicaHodnot<Integer>(20, 22);
		System.out.println("Prvy prvok: " + dvojica.getPrvyClen());
		System.out.println("ocakavana hodnota: 20");
		System.out.println("Druhy prvok: " + dvojica.getDruhyClen());
		System.out.println("ocakavana hodnota: 22");
	}

}
