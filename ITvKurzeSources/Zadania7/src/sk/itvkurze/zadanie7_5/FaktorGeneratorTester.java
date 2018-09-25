package sk.itvkurze.zadanie7_5;

public class FaktorGeneratorTester {

	public static void main(String[] args) {

		FaktorGenerator faktGen1 = new FaktorGenerator(150);

		System.out.println("Faktory cisla 150");
		while (faktGen1.existujeDalsiFaktor()) {
			System.out.println(faktGen1.dalsiFaktor());
		}

		System.out.println();
		System.out.println("Faktory cisla 123456");
		FaktorGenerator faktGen2 = new FaktorGenerator(123456);

		while (faktGen2.existujeDalsiFaktor()) {
			System.out.println(faktGen2.dalsiFaktor());
		}
	}

}

