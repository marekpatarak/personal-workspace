package sk.itvkurze.zadanie6_1;

public class KvadratickaRovnica {
	private int a, b, c;
	private double diskrim;

	// konstruktor s parametrami a, b a c
	public KvadratickaRovnica(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.diskrim = this.vypocitajDiskriminant();
	}

	// vracia pole 2 rieseni
	private double[] vyriesRovnicu() {
		double[] ries = {0,0};

		if (this.jeRiesitelna() == false) {

		} else {
			ries[0] = ((-this.b - Math.sqrt(this.vypocitajDiskriminant())) / (2 * this.a));
			ries[1] = ((-this.b + Math.sqrt(this.vypocitajDiskriminant())) / (2 * this.a));
		}

		return ries;
	}

	// vracia diskriminant
	private double vypocitajDiskriminant() {
		return (this.b * this.b) - (4 * this.a * this.c);
	}

	public double getDiskriminant() {
		return this.diskrim;
	}

	public double getRiesenie1() {
		double[] ries = this.vyriesRovnicu();
		double hodnota;
		if (ries[0] == ries[1]) {
			hodnota = ries[0];
		} else
		if (ries[0] > ries[1]) {
			hodnota = ries[1];
		} else {
			hodnota = ries[0];
		}
		return hodnota;
	}

	public double getRiesenie2() {
		double[] ries = this.vyriesRovnicu();
		double hodnota;
		if (ries[0] == ries[1]) {
			hodnota = ries[0];
		} else if (ries[0] < ries[1]) {
			hodnota = ries[1];
		} else {
			hodnota = ries[0];
		}
		return hodnota;
	}


	// funguje
	public boolean jeRiesitelna() {
		return this.vypocitajDiskriminant() >= 0;
	}

}
