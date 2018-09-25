package sk.itvkurze.zadanie14_7;

public class Elipsa extends Tvar2D {

	double poloosA, poloosB;

	public Elipsa(double poloosA, double poloosB) {
		this.poloosB = poloosB;
		this.poloosA = poloosA;
		super.obvod = vypocitajObvodElipsy(this.poloosA, this.poloosB);
		super.obsah = vypocitajObsahElipsy(this.poloosA, this.poloosB);

	}

	private double vypocitajObsahElipsy(double poloosA, double poloosB) {
		return super.roundUp(Math.PI * this.poloosA * this.poloosB);
	}

	private double vypocitajObvodElipsy(double poloosA, double poloosB) {
		return super.roundUp(Math.sqrt(2 * (Math.pow(this.poloosA, 2) + Math.pow(this.poloosB, 2))) * Math.PI);
	}

	@Override
	public void vypisAtributy() {
		super.vypisAtributy();
		System.out.println("Poloos A je : " + this.poloosA);
		System.out.println("Poloos B je : " + this.poloosB);

	}
}
