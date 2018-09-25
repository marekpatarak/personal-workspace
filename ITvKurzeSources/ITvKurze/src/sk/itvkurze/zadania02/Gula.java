package sk.itvkurze.zadania02;

public class Gula {
	public double polomer;
	public double povrch;
	public double objem;

	public Gula(double a) {
		polomer = a;
		povrch = vypocitajPovrch(polomer);
		objem = vypocitajObjem(polomer);
	}

	public double vypocitajPovrch(double a) {
		double pov;
		pov = 4 * Math.PI * a * a;
		return pov;
	}

	public double vypocitajObjem(double a) {
		double obj;
		obj = (4 * Math.PI) / 3 * a * a * a;
		return obj;
	}

	public double getPolomer() {
		return polomer;
	}

	public double getPovrch() {
		return povrch;
	}

	public double getObjem() {
		return objem;
	}

}
