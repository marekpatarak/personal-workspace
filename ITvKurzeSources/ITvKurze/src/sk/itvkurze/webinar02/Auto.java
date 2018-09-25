package sk.itvkurze.webinar02;

public class Auto {
	// atributy objektu
	public String nazov;
	public int rychlost; // km/h
	public double cena; // v EUR

	// konstruktory
	public Auto() {
		nazov = "nezname auto";
		rychlost = 0;
		cena = 20000;
	}

	public Auto(String nazovAuta, int rychlostAuta, double cenaAuta) {
		nazov = nazovAuta;
		rychlost = rychlostAuta;
		cena = cenaAuta;
	}

	// metody

}
