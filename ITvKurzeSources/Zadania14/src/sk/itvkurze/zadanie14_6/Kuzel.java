package sk.itvkurze.zadanie14_6;

public class Kuzel extends Tvar {
	private double v;

	public Kuzel(double r, double v) {
		this.v = v;
		super.r = r;
		super.povrch = vypocitajPovrchRotacnehoKuzela(super.r, this.v);
		super.objem = vypocitajObjemRotacnehoKuzela(super.r, this.v);
	}

	private double vypocitajObjemRotacnehoKuzela(double r, double v) {
		return super.roundUp((Math.PI * r * r * v) / 3);
	}

	private double vypocitajPovrchRotacnehoKuzela(double r, double v) {
		return super.roundUp((Math.PI * r * r) + ((Math.sqrt((r * r) + (v * v)) * r * Math.PI)));
	}

}
