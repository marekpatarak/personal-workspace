package sk.itvkurze.zadania05;

public class Vyrobok {
	private String nazov;
	private double cena;

	public Vyrobok(String nazov, double cena) {
		this.cena = cena;
		this.nazov = nazov;
	}

	public String getNazov() {
		return nazov;
	}

	public double getCena() {
		return cena;
	}

	private void setCena(double cena) {
		this.cena = cena;
	}

	public void znizCenu(double zlava) {
		this.setCena(this.cena -= zlava);
	}

	public void vypisVyrobok() {
		System.out.println("Nazov vyrobku: " + this.getNazov());
		System.out.println("Aktualna cena vyrobku: " + this.getCena());
	}


}
