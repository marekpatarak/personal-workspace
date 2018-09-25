package sk.itvkurze.zadanie26_4;

public class Minca implements Meratelne {
	double hodnota;
	String nazov;

	public Minca(double hodnota, String nazov) {
		this.hodnota = hodnota;
		this.nazov = nazov;
	}

	@Override
	public double getHodnota() {
		return this.hodnota;
	}

	public String getNazov() {
		return this.nazov;
	}

	@Override
	public String toString() {
		return (String.valueOf(this.getHodnota()));
	}


}

