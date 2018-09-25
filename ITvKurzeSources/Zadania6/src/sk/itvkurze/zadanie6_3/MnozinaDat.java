package sk.itvkurze.zadanie6_3;

public class MnozinaDat {
	double[] pole;

	public MnozinaDat(double a, double b, double c) {
		this.pole = new double[3];
		this.pole[0] = a;
		this.pole[1] = b;
		this.pole[2] = c;

	}

	public void zorad() {
		double n;

		for (int i = 1; i < this.pole.length; i++) {
			if (this.pole[i - 1] > this.pole[i]) {
				n = this.pole[i - 1];
				this.pole[i - 1] = this.pole[i];
				this.pole[i] = n;
			}
		}
	}

	public double getNajmensieCislo() {

		return this.pole[0];
	}

	public double getProstredneCislo() {
		return this.pole[1];

	}

	public double getNajvacsieCislo() {
		return this.pole[2];

	}

}
