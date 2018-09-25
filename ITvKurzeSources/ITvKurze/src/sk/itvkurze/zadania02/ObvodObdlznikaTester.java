package sk.itvkurze.zadania02;

import sk.itvkurze.zadania02.Obdlznik;

public class ObvodObdlznikaTester {

	public static void main(String[] args) {
		Obdlznik obdlznik2 = new Obdlznik(6, 12);

		System.out.println("Strana A obdlznika je: " + obdlznik2.getStranaA());
		System.out.println("Strana B obdlznika je: " + obdlznik2.getStranaB());
		System.out.println("Obvod obdlznika je: " + ((obdlznik2.getStranaA() * 2) + obdlznik2.getStranaB() * 2));
		System.out.println("Ocakavany vysledok je: " + (6 * 2 + 12 * 2));
	}

}
