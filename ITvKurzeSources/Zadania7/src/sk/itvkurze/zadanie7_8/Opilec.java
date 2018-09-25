package sk.itvkurze.zadanie7_8;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class Opilec {
	private int x;
	private int y;
	private Ellipse2D.Double obrysPozicie;

	public Opilec() {
		this.x = 400;
		this.y = 400;
		this.obrysPozicie = new Ellipse2D.Double(this.x - 3, this.y - 3, 6, 6);
	}

	public void nakresliPoziciu(Graphics2D g2) {
		g2.setColor(Color.GREEN);
		obrysPozicie.setFrame(this.x - 3, this.y - 3, 6, 6);
		g2.draw(this.obrysPozicie);
		g2.fill(this.obrysPozicie);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x += x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y += y;
	}

	public void spravKrok() {
		boolean smerSever, smerZapad;
		Random random = new Random();
		smerSever = random.nextBoolean();
		smerZapad = random.nextBoolean();

		if (smerSever) {
			setY(-20);
		} else {
			setY(10);
		}

		if (smerZapad) {
			setX(-20);
		} else {
			setX(10);
		}
	}

	public void nakresliStvrt(Graphics2D g2) {

		Line2D.Double horizont = new Line2D.Double();
		Line2D.Double vertikal = new Line2D.Double();

		for (int i = 1; i < 20; i++) {
			horizont.setLine(0, 40 * i, 800, 40 * i);
			g2.draw(horizont);

			vertikal.setLine(40 * i, 0, 40 * i, 800);
			g2.draw(vertikal);

		}

		Rectangle domov = new Rectangle(0, 0, 100, 100);

		g2.setColor(Color.BLUE);
		g2.fill(domov);

		Rectangle krcma = new Rectangle(400, 400, 100, 100);

		g2.setColor(Color.RED);
		g2.fill(krcma);

	}


}

