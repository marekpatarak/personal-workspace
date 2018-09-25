package sk.itvkurze.zadanie14_7;

public class Valec extends Tvar3D {

	double polomer;

	public Valec(double r, double v) {
		super.vyska = v;
		this.polomer = r;
		super.povrch = vypocitajPovrchValca(this.polomer, super.vyska);
		super.objem = vypocitajObjemValca(this.polomer, super.vyska);
	}

	private double vypocitajObjemValca(double r, double v) {
		return super.roundUp(Math.PI * r * r * v);
	}

	private double vypocitajPovrchValca(double r, double v) {
		return super.roundUp((Math.PI * r * r * 2) + (2 * Math.PI * r * v));
	}

	@Override
	public void vypisAtributy() {
		super.vypisAtributy();
		System.out.println("Vyska 3D tvaru " + getClass().getSimpleName() + " je " + this.vyska);
		System.out.println("Polomer podstavy 3D tvaru " + getClass().getSimpleName() + " je " + this.polomer);

	}

}
