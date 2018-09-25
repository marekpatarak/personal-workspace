package sk.itvkurze.zadanie6_13;

public class Vyplata {
	double hodMzda, odpracHod;

	public Vyplata(double hodMzda, double odpracHod) {
		this.hodMzda = hodMzda;
		this.odpracHod = odpracHod;
	}

	public double getVyplata() {
		if (this.odpracHod > 40) {

			return (40 * this.hodMzda) + ((this.odpracHod - 40) * (this.hodMzda * 1.5));

		} else

			return this.hodMzda * this.odpracHod;
	}
}
