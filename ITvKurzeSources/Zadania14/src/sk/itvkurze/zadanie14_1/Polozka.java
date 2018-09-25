package sk.itvkurze.zadanie14_1;

public class Polozka extends Tovar {

	private int pocet;

	public Polozka(Tovar tovar, int pocet) {
		super(tovar.nazov, tovar.cenaBezDPH, tovar.sadzbaDPH);
		this.pocet = pocet;
	}

	@Override
	protected double getCenaDPH() {
		double celkCenaDPH = getCenaBezDPH() * getPocet();
		return celkCenaDPH + (celkCenaDPH * (getSadzbaDPH() / 100));
	}

	protected int getPocet() {
		return this.pocet;
	}

	@Override
	public String toString() {
		return getNazov() + " " + getCenaBezDPH() + " " + getSadzbaDPH() + "% " + getPocet() + " ks";
	}
}
