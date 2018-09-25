package sk.itvkurze.zadanie14_6;

public class Gula extends Tvar {

	public Gula(double r) {
		super.r = r;
		super.povrch = vypocitajPovrchGule(super.r);
		super.objem = vypocitajObjemGule(super.r);
	}

	private double vypocitajObjemGule(double r) {
		return super.roundUp(((4 * Math.PI) / 3) * Math.pow(r, 3));
	}

	private double vypocitajPovrchGule(double r) {
		return super.roundUp((4 * Math.PI) * Math.pow(r, 2));
	}


}
