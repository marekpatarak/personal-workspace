package sk.itvkurze.webinar21.mnoziny;

public class Inventar {

	public static Vyrobok dvere = new Vyrobok("Drevene dvere", 35);
	public static Vyrobok okno = new Vyrobok("Plastove okno", 25);
	public static Vyrobok stol = new Vyrobok("Skleneny stol", 10);

	public static Dodavatel obi = new Dodavatel("Obi");
	public static Dodavatel hornbach = new Dodavatel("Hornbach");

	static {
		obi.getVyrobky().add(okno);
		obi.getVyrobky().add(dvere);

		hornbach.getVyrobky().add(okno);
		hornbach.getVyrobky().add(stol);
	}
}
