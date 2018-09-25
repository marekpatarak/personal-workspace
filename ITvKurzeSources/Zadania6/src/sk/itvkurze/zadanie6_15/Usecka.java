package sk.itvkurze.zadanie6_15;

import java.awt.geom.Line2D;

public class Usecka {
	private double x1, y1, x2, y2, b, m;
	private static final double konstanta = 1.0;
	Line2D usecka;

	public Usecka(double x, double y, double m) {
		this.x1 = x;
		this.y1 = y;
		this.m = m;
		this.x2 = x + konstanta;
		this.y2 = m * x2;
		this.b = 0;
		this.usecka = new Line2D.Double(this.x1, this.y1, this.x2, this.y2);
	}

	public Usecka(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

		if (this.y2 - this.y1 == 0) {
			this.m = 0;
		} else {

		}
		this.b = this.y1 - (this.m * this.x1);
		this.usecka = new Line2D.Double(this.x1, this.y1, this.x2, this.y2);
	}

	public Usecka(double m, double b) {
		this.x1 = 0;
		this.x2 = x1 + konstanta;
		this.m = m;
		this.b = b;
		this.y1 = (m * this.x1) + b;
		this.y2 = (m * this.x1) + b;
		this.usecka = new Line2D.Double(this.x1, this.y1, this.x2, this.y2);
	}

	public Usecka(double a) {
		this.x1 = a;
		this.x2 = a;
		this.y1 = 1.0;
		this.y2 = this.y1 + konstanta;
		this.usecka = new Line2D.Double(this.x1, this.y1, this.x2, this.y2);
	}

	public boolean pretina(Usecka dalsiaUsecka) {
		return this.usecka.intersectsLine(dalsiaUsecka.usecka);

	}

	public boolean rovnaSa(Usecka dalsiaUsecka) {
		if (this.x1 == dalsiaUsecka.x1 && this.x2 == dalsiaUsecka.x2 && this.y1 == dalsiaUsecka.y1
				&& this.y2 == dalsiaUsecka.y2) {
			return true;
		}
		return false;
	}

	public boolean jeParalelna(Usecka dalsiaUsecka) {

		if ((this.m == dalsiaUsecka.m) || (this.b == dalsiaUsecka.b)) {
			return true;
		}
		return false;
	}

}
