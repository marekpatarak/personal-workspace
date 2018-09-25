package sk.itvkurze.zadanie14_7;

public class Tvar3D extends Tvar {

	public double povrch, objem;
	public double vyska;

	protected double getPovrch() {
		return this.povrch;
	}

	protected double getObjem() {
		return this.objem;
	}

	protected void vypisAtributy() {
		System.out.println("Povrch 3D tvaru " + getClass().getSimpleName() + " je " + getPovrch());
		System.out.println("Objem 3D tvaru " + getClass().getSimpleName() + " je " + getObjem());

	}
}
