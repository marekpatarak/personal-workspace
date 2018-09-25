package sk.itvkurze.zadanie7_10;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Kruznice {
	private int width;
	private int height;


	public Kruznice(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public void nakresli(Graphics2D g2) {
		int x, y, polomer;

		Random random = new Random();
		Ellipse2D.Double kruznica = new Ellipse2D.Double();

		polomer = random.nextInt(this.width / 8);
		x = random.nextInt(this.width - (polomer * 2));
		y = random.nextInt(this.height - (polomer * 2));

		kruznica.setFrame(x, y, polomer * 2, polomer * 2);
		g2.draw(kruznica);

	}

}


