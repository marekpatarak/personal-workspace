package sk.itvkurze.zadanie6_9;

public class PrestupnyRokTester {

	public static void main(String[] args) {

		PrestupnyRok rok = new PrestupnyRok(1980);
		System.out.println(rok.jePrestupnyRok());
		System.out.println("Ocakavana hodnota: true");

		PrestupnyRok rok1 = new PrestupnyRok(1900);
		System.out.println(rok1.jePrestupnyRok());
		System.out.println("Ocakavana hodnota: false");

		PrestupnyRok rok2 = new PrestupnyRok(2000);
		System.out.println(rok2.jePrestupnyRok());
		System.out.println("Ocakavana hodnota: true");

		PrestupnyRok rok3 = new PrestupnyRok(1500);
		System.out.println(rok3.jePrestupnyRok());
		System.out.println("Ocakavana hodnota: false");

		PrestupnyRok rok4 = new PrestupnyRok(1501);
		System.out.println(rok4.jePrestupnyRok());
		System.out.println("Ocakavana hodnota: false");
	}

}
