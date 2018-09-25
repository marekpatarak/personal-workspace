package sk.itvkurze.zadanie26_4;

public class DvojicaHodnotUtilTester {

	public static void main(String[] args) {

		Minca[] mince = { new Minca(0.5, "Patdesiatcentovka"), new Minca(0.02, "Dvojcentovka"),
				new Minca(2, "Dvojeurovka"), new Minca(1, "Eurovka"), new Minca(0.1, "Desatcentovka"),
				new Minca(0.01, "Centovka") };

		DvojicaHodnot<Minca, Minca> minimumMaximum = DvojicaHodnotUtil.minmax(mince, new MincaComparator());
		System.out.println("Minca s najmensou hodnotou: " + minimumMaximum.getPrvyClen());
		System.out.println("Ocakavana hodnota:  0.01");
		System.out.println("Minca s najvacsiou hodnotou: " + minimumMaximum.getDruhyClen());
		System.out.println("Ocakavana hodnota:  2");
	}

}
