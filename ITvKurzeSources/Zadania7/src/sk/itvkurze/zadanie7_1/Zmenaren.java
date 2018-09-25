package sk.itvkurze.zadanie7_1;

public class Zmenaren {
	double kurz;

	public void setKurz(double kurz) {
		this.kurz = kurz;
	}

	public void zamen(double suma) {
		System.out.println(suma + " dolarov = " + suma * this.kurz + " eur");
	}
}
