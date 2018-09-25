package sk.itvkurze.zadania02;

public class GulaTest {

	public static void main(String[] args) {
		Gula gula1 = new Gula(2.5);

		System.out.println("Polomer gule je: " + gula1.getPolomer());
		System.out.println("Povrch gule je: " + gula1.getPovrch());
		System.out.println("Objem gule je: " + gula1.getObjem());
		System.out.println("Ocakavany povrch je: " + 4 * Math.PI * 2.5 * 2.5);
		System.out.println("Ocakavany objem je: " + ((4 * Math.PI) / 3 * 2.5 * 2.5 * 2.5));
	}

}
