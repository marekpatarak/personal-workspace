package sk.itvkurze.zadanie14_9;

import java.awt.geom.Point2D;

public class Elipsa extends Tvar2D {

	double poloosA, poloosB;
	double x1, y1;

	public Elipsa(double poloosA, double poloosB) {
		this.poloosB = poloosB;
		this.poloosA = poloosA;
		super.obvod = vypocitajObvodElipsy(this.poloosA, this.poloosB);
		super.obsah = vypocitajObsahElipsy(this.poloosA, this.poloosB);

	}

	public Elipsa(double x1, double y1, double width, double height) {
		this.x1 = x1;
		this.y1 = y1;
		this.poloosA = width / 2;
		this.poloosB = height / 2;

	}

	public boolean jeVoVnutri(Point2D bod) {
		if ((((bod.getX() * bod.getX()) / (this.poloosA * this.poloosA)))
				+ ((bod.getY() * bod.getY()) / (this.poloosB * this.poloosB)) < 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean jeNaObvode(Point2D bod) {
		if ((((bod.getX() * bod.getX()) / (this.poloosA * this.poloosA)))
				+ ((bod.getY() * bod.getY()) / (this.poloosB * this.poloosB)) == 1) {
			return true;
		} else {
			return false;
		}
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
