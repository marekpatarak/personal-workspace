package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class OlympKruh {
	private int stredX;
	private int stredY;
	private int polomer;
	private Color color;

	public OlympKruh(int stredX, int stredY, Color color) {
		polomer = 100;
		this.stredX = stredX;
		this.stredY = stredY;
		this.color = color;

	}

	public void setFarba(Color color) {
		this.color = color;
	}

	public void posunKruh(int posunX, int posunY) {
		this.stredX += posunX;
		this.stredY += posunY;
	}

	public void nakresliKruh(Graphics2D g2) {

		Ellipse2D.Double kruh = new Ellipse2D.Double(this.stredX - polomer, this.stredY - polomer, polomer * 2,
				polomer * 2);
		g2.setColor(this.color);
		g2.draw(kruh);
		g2.fill(kruh);

		kruh.setFrame(this.stredX - (polomer * 0.9), this.stredY - (polomer * 0.9), polomer * 2 * 0.9,
				polomer * 2 * 0.9);
		g2.setColor(Color.WHITE);
		g2.draw(kruh);
		g2.fill(kruh);
	}
}
