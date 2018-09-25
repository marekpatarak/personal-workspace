package sk.itvkurze.webinar08;

public class Tovar {

	private String nazov_tovaru;
	private double cena_tovaru;

	public Tovar(String nazov, double cena) {
		this.nazov_tovaru = nazov;
		this.cena_tovaru = cena;
	}

	public double get_cena() {
		return this.cena_tovaru;
	}

	public String get_nazov() {
		return this.nazov_tovaru;
	}

	public void set_cena(double nova_cena) {
		this.cena_tovaru = nova_cena;
	}

	public void set_nazov(String novy_nazov) {
		this.nazov_tovaru = novy_nazov;
	}

	public void vypisInfoTovar() {
		System.out.println("Informacia o tovare");
		System.out.println("Nazov tovaru: " + this.get_nazov());
		System.out.println("Cena tovaru: " + this.get_cena());
	};

}
