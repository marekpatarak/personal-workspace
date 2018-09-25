package sk.itvkurze.zadanie26_6;

public class BankovyUcet implements Comparable<BankovyUcet> {
	protected double zostatok;

	public BankovyUcet() {
		this.zostatok = 0;
	}

	public BankovyUcet(final double pociatocnyZostatok) {
		this.zostatok = pociatocnyZostatok;
	}

	public void vloz(double ciastka) {
		this.zostatok += ciastka;
	}

	public void vyber(double ciastka) {
		this.zostatok -= ciastka;
	}

	public double getZostatok() {
		return this.zostatok;
	}

	@Override
	public int compareTo(BankovyUcet dalsiUcet) {
		double rozdiel = this.zostatok - dalsiUcet.getZostatok();
		if (rozdiel < 0) {
			return -1;
		} else if (rozdiel > 0) {
			return 1;
		}
		return 0;
	}
}
