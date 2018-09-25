package sk.itvkurze.zadanie14_9;

public class Tvar2D extends Tvar {

	public double obsah, obvod;

	protected double getObsah() {
		return this.obsah;
	}

	protected double getObvod() {
		return this.obvod;
	}

	protected void vypisAtributy() {
		System.out.println("Obsah 2D tvaru " + getClass().getSimpleName() + " je " + getObsah());
		System.out.println("Obvod 2D tvaru " + getClass().getSimpleName() + " je " + getObvod());

	}

}
