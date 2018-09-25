package sk.itvkurze.zadanie14_6;

public class Valec extends Tvar {

	private double v;

	public Valec(double r, double v) {
		this.v = v;
		super.r = r;
		super.povrch = vypocitajPovrchValca(super.r, this.v);
		super.objem = vypocitajObjemValca(super.r, this.v);
	}

	private double vypocitajObjemValca(double r, double v) {
		return super.roundUp(Math.PI * r * r * v);
	}

	private double vypocitajPovrchValca(double r, double v) {
		return super.roundUp((Math.PI * r * r * 2) + (2 * Math.PI * r * v));
	}

}
