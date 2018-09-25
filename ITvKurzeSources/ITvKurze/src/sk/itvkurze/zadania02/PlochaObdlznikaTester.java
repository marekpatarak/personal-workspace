package sk.itvkurze.zadania02;

public class PlochaObdlznikaTester {

	public static void main(String[] args) {
		Obdlznik obdlznik1 = new Obdlznik(5, 10);

		System.out.println("Strana A obdlznika je: " + obdlznik1.getStranaA());
		System.out.println("Strana B obdlznika je: " + obdlznik1.getStranaB());
		System.out.println("Obsah obdlznika je: " + obdlznik1.getStranaA() * obdlznik1.getStranaB());

	}

}
