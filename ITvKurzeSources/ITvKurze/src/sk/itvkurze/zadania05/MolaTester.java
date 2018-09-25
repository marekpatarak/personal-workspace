package sk.itvkurze.zadania05;

public class MolaTester {

	public static void main(String[] args) {
		Mola smrtohlav = new Mola(10);

		System.out.println("Pociatocna poloha mole: " + smrtohlav.getPoloha());
		System.out.println("Ocakavana poloha mole: 10");
		smrtohlav.letZaSvetlom(0);

		System.out.println("Aktualna poloha mole: " + smrtohlav.getPoloha());
		System.out.println("Ocakavana poloha mole: 5");

		smrtohlav.letZaSvetlom(10);

		System.out.println("Aktualna poloha mole: " + smrtohlav.getPoloha());
		System.out.println("Ocakavana poloha mole: 7.5");

		smrtohlav.letZaSvetlom(0);

		System.out.println("Aktualna poloha mole: " + smrtohlav.getPoloha());
		System.out.println("Ocakavana poloha mole: 3.75");


	}

}
