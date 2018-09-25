package sk.itvkurze.zadanie7_9;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Sachovnica {
	private int width;
	private int height;


	public Sachovnica(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public void nakresliSachovnicu(Graphics2D g2) {
		boolean isBlack = true;

		Rectangle stvorec = new Rectangle(0, 0, this.width / 8, this.height / 8);

		for (int i = 1; i <= 64; i++) {
			if (isBlack) {
				g2.setColor(Color.BLACK);
			} else {
				g2.setColor(Color.WHITE);
			}
			g2.draw(stvorec);
			g2.fill(stvorec);
			stvorec.translate(this.width / 8, 0);
			isBlack = !isBlack;

			if (i % 8 == 0) {
				stvorec.setLocation(0, i / 8 * this.height / 8);
				isBlack = !isBlack;
			}
		}
	}

}

