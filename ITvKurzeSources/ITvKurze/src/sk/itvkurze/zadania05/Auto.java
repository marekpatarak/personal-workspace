package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Auto {
	private double spotreba;
	private double stavNadrze;
	private double stavTachometra;
	private int hornyRohX;
	private int hornyRohY;
	private int width;
	private int height;
	private Color color;

	public Auto(double spotreba) {
		this.stavNadrze = 0;
		this.stavTachometra = 0;
		this.spotreba = spotreba;
	}

	public Auto(int x, int y, int width, int height, Color color) {
		this.hornyRohX = x;
		this.hornyRohY = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void nakresli(Graphics2D g2) {

		Rectangle karoseria = new Rectangle(this.hornyRohX, this.hornyRohY + (this.height / 3), this.width,
				this.height / 3);
		Line2D.Double strecha1 = new Line2D.Double(this.hornyRohX + (this.width / 3), this.hornyRohY,
				this.hornyRohX + 2 * (this.width / 3), this.hornyRohY);
		Line2D.Double strecha2 = new Line2D.Double(this.hornyRohX, this.hornyRohY + (this.height / 3),
				this.hornyRohX + (this.width / 3), this.hornyRohY);
		Line2D.Double strecha3 = new Line2D.Double(this.hornyRohX + 2 * (this.width / 3), this.hornyRohY,
				this.hornyRohX + this.width, this.hornyRohY + (this.height / 3));

		Ellipse2D.Double koleso1 = new Ellipse2D.Double(this.hornyRohX + (this.width / 8),
				this.hornyRohY + 2 * (this.height / 3), this.height / 3, this.height / 3);

		Ellipse2D.Double koleso2 = new Ellipse2D.Double(this.hornyRohX + 6 * (this.width / 8),
				this.hornyRohY + 2 * (this.height / 3), this.height / 3, this.height / 3);

		g2.setColor(this.color);
		g2.draw(karoseria);
		g2.draw(strecha1);
		g2.draw(strecha2);
		g2.draw(strecha3);
		g2.draw(koleso1);
		g2.draw(koleso2);
	}

	public double getStavNadrze() {
		return stavNadrze;
	}

	public double getStavTachometra() {
		return stavTachometra;
	}

	public void setSpotreba(double spotreba) {
		this.spotreba = spotreba;
	}

	public void natankuj(double tankovanie) {
		this.stavNadrze += tankovanie;
	}

	public void jazdi(double vzdialenost) {
		if (this.stavNadrze == 0) {
			System.out.println("nemas palivo, natankuj");
		} else {
			if (this.stavNadrze >= (this.spotreba * vzdialenost / 100)) {
				this.stavNadrze -= (this.spotreba * vzdialenost / 100);
				this.stavTachometra += vzdialenost;
			} else {
				System.out.println("Auto nepreslo " + vzdialenost + " kilometrov, minulo sa palivo po prejdeni "
					+ this.stavNadrze / this.spotreba * 100 + " kilometrov");
				this.stavTachometra += this.stavNadrze / this.spotreba * 100;
				this.stavNadrze = 0;
			}
		}

	}
}
