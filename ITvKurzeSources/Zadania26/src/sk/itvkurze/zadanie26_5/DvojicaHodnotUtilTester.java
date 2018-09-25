package sk.itvkurze.zadanie26_5;

public class DvojicaHodnotUtilTester {

	public static void main(String[] args) {

		String[] mena = { "Igor Kovac", "Jan Novak", "Emil Horvath", "Karol Karasen", "Peter Janasek" };

		DvojicaHodnot<String, String> minimumMaximum = DvojicaHodnotUtil.minmax(mena);
		System.out.println("Prve meno: " + minimumMaximum.getPrvyClen());
		System.out.println("Ocakavana hodnota: Emil Horvath");
		System.out.println("Posledne meno: " + minimumMaximum.getDruhyClen());
		System.out.println("Ocakavana hodnota: Peter Janasek");
	}

}
