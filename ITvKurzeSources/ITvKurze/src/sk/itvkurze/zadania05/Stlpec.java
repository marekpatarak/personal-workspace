package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Stlpec {
	private int hodnota;
	private int polohaY;
	private String nazov;
	private Color color;


	public Stlpec(String nazov, int polohaY, int hodnota, Color color) {
		this.nazov = nazov;
		this.polohaY = polohaY;
		this.hodnota = hodnota;
		this.color = color;

	}

	public void setFarba(Color color) {
		this.color = color;
	}


	public void nakresliStlpec(Graphics2D g2) {

		Rectangle stlpec = new Rectangle(0, this.polohaY, this.hodnota, 100);
		g2.setColor(this.color);
		g2.draw(stlpec);
		g2.setFont(new Font("font", 1, 20));
		g2.drawString(this.nazov, 50, this.polohaY + 50);
	}
}
