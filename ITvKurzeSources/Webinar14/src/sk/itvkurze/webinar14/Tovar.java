package sk.itvkurze.webinar14;

/**
 * Trieda Tovar, atributy triedy su znacka a typ typu String a cena typu double
 */
public class Tovar {
	String znacka;
	String typ;
	double cena;

	/**
	 * parametricky konstruktor so vsetkymi atributmi triedy ako parametrami,
	 * vytvara objekt triedy Tovar
	 */
	public Tovar(String znacka, String typ, double cena) {
		this.znacka = znacka;
		this.typ = typ;
		this.cena = cena;
		
	}

}
