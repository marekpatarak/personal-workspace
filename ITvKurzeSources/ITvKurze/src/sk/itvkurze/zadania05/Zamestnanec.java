package sk.itvkurze.zadania05;

public class Zamestnanec {
	private String meno;
	private double aktualnyPlat;

	public Zamestnanec(String meno, double aktualnyPlat) {
		this.meno = meno;
		this.aktualnyPlat = aktualnyPlat;
	}

	public String getMeno() {
		return meno;
	}

	public double getPlat() {
		return aktualnyPlat;
	}

	public void navysPlat(double percMiera) {
		this.aktualnyPlat += (this.aktualnyPlat * percMiera / 100);
	}

}
