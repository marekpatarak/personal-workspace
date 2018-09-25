package sk.itvkurze.zadanie14_6;

public class Tvar {
	
	public double r, povrch, objem;
	

	protected static double roundUp(double vstup) {
		double round = 100 * vstup;
		round = Math.round(round);
		return round / 100;
	}

	protected double getPovrch() {
		return this.povrch;
	}

	protected double getObjem() {
		return this.objem;
	}
}
