package sk.itvkurze.zadanie14_7;

public class Kuzel extends Tvar3D {

	double polomer;

	public Kuzel(double r, double v) {
		super.vyska = v;
		this.polomer = r;
		super.povrch = vypocitajPovrchRotacnehoKuzela(this.polomer, super.vyska);
		super.objem = vypocitajObjemRotacnehoKuzela(this.polomer, super.vyska);
	}

	private double vypocitajObjemRotacnehoKuzela(double r, double v) {
		return super.roundUp((Math.PI * r * r * v) / 3);
	}

	private double vypocitajPovrchRotacnehoKuzela(double r, double v) {
		return super.roundUp((Math.PI * r * r) + ((Math.sqrt((r * r) + (v * v)) * r * Math.PI)));
	}

	@Override
	public void vypisAtributy() {
		super.vypisAtributy();
		System.out.println("Vyska 3D tvaru " + getClass().getSimpleName() + " je " + this.vyska);
		System.out.println("Polomer podstavy 3D tvaru " + getClass().getSimpleName() + " je " + this.polomer);

	}

}
