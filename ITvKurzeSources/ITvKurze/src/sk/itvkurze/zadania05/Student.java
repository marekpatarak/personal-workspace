package sk.itvkurze.zadania05;

public class Student {
	private String meno;
	private double celkoveSkore;
	private int pocetTestov;

	public Student(String meno) {
		this.celkoveSkore = 0;
		this.pocetTestov = 0;
		this.meno = meno;
	}

	public String getMeno() {
		return meno;
	}

	public double getCelkoveSkore() {
		return celkoveSkore;
	}

	public double getPriemerneSkore() {
		return this.celkoveSkore / this.pocetTestov;
	}

	private void zvysPocetTestov() {
		this.pocetTestov++;
	}

	private void zvysCelkoveSkore(double skore) {
		this.celkoveSkore += skore;
	}

	public void vykonajTest(int dosiahnuteSkore) {
		this.zvysCelkoveSkore(dosiahnuteSkore);
		this.zvysPocetTestov();
	}


}
