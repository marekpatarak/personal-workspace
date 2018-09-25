package sk.itvkurze.zadanie7_5;

public class FaktorGenerator {
	public int vstup, poslFaktor;

	public FaktorGenerator(int vstup) {
		this.vstup = vstup;
		this.poslFaktor = 1;
	}

	private int najdiFaktor(int n) {
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				return i;
			}

		}
		return 0;
	}

	public int dalsiFaktor() {
		int df;
		df = najdiFaktor(this.vstup);
		this.poslFaktor = df;
		this.vstup = this.vstup / this.poslFaktor;
		return df;
	}

	public boolean existujeDalsiFaktor() {
		if (najdiFaktor(this.vstup) == 0) {
			return false;
		} else
			return true;
	}
}
