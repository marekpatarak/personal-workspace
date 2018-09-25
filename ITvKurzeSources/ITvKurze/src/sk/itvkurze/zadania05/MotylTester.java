package sk.itvkurze.zadania05;

public class MotylTester {

	public static void main(String[] args) {
		Motyl babocka = new Motyl(5);

		System.out.println("Pociatocna poloha motyla: " + babocka.getPoloha());
		System.out.println("Ocakavana poloha motyla: 5");
		babocka.let();
		babocka.let();

		System.out.println("Aktualna poloha motyla: " + babocka.getPoloha());
		System.out.println("Ocakavana poloha motyla: 7");

		babocka.zmenSmer();
		babocka.let();

		System.out.println("Aktualna poloha motyla: " + babocka.getPoloha());
		System.out.println("Ocakavana poloha motyla: 6");

		babocka.zmenSmer();
		babocka.let();
		babocka.let();

		System.out.println("Aktualna poloha motyla: " + babocka.getPoloha());
		System.out.println("Ocakavana poloha motyla: 8");

	}

}
