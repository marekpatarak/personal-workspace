package sk.itvkurze.zadanie14_7;

public class Gula extends Tvar3D {

	double polomer;

	public Gula(double r) {
		this.polomer = r;
		super.povrch = vypocitajPovrchGule(this.polomer);
		super.objem = vypocitajObjemGule(this.polomer);
	}

	private double vypocitajObjemGule(double r) {
		return super.roundUp(((4 * Math.PI) / 3) * Math.pow(r, 3));
	}

	private double vypocitajPovrchGule(double r) {
		return super.roundUp((4 * Math.PI) * Math.pow(r, 2));
	}

	@Override
	public void vypisAtributy() {
		super.vypisAtributy();
		System.out.println("Polomer 3D tvaru " + getClass().getSimpleName() + " je " + this.polomer);

	}

}
