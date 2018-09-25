package sk.itvkurze.zadanie26_6;

public class DvojicaHodnotUtilTester {
	public static void main(String[] args) {
		SporiaciUcet[] ucty = { new SporiaciUcet(5.0), new SporiaciUcet(2.0), new SporiaciUcet(0.25) };

		ucty[0].vloz(1000);
		ucty[1].vloz(1000);
		ucty[2].vloz(1000);

		for (SporiaciUcet ucet : ucty) {
			ucet.pripisUrok();
		}

		ucty[0].vyber(1000);
		ucty[1].vyber(1000);
		ucty[2].vyber(1000);

		DvojicaHodnot<SporiaciUcet, SporiaciUcet> minimumMaximum = DvojicaHodnotUtil.minmax(ucty);
		System.out.println("Sporiaci ucet s najnizssim zostatkom: " + minimumMaximum.getPrvyClen().getZostatok());
		System.out.println("Ocakavana hodnota: 2.5");
		System.out.println("Sporiaci ucet s najvyssim zostatkom: " + minimumMaximum.getDruhyClen().getZostatok());
		System.out.println("Ocakavana hodnota: 50");
	}
}
