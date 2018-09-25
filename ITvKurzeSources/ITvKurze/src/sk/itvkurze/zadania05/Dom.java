package sk.itvkurze.zadania05;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class Dom {
	private int hornyRohX;
	private int hornyRohY;
	private int width;
	private int height;

	public Dom(int x, int y) {
		this.hornyRohX = x;
		this.hornyRohY = y;
	}

	public Dom(int x, int y, int width, int height) {
		this.hornyRohX = x;
		this.hornyRohY = y;
		this.width = width;
		this.height = height;

	}

	public void nakresli(Graphics2D g2) {
		Rectangle back = new Rectangle(this.hornyRohX, this.hornyRohY, this.width, this.height);

		Rectangle dom = new Rectangle(back.x, back.y + (back.height / 2), back.width, back.height / 2);
		Rectangle okno = new Rectangle(back.x + back.width / 8, back.y + back.height - (back.height / 3),
				back.width / 8,
				back.height / 8);
		Rectangle dvere = new Rectangle(back.x + back.width / 2, back.y + back.height - (back.height / 3),
				back.width / 4,
				back.height / 3);

		// g2.draw(back);
		g2.draw(dom);
		g2.draw(okno);
		g2.draw(dvere);

		Line2D.Double strecha1 = new Line2D.Double(back.x, back.y + (back.height / 2), back.x + (back.width / 2),
				back.y);
		Line2D.Double strecha2 = new Line2D.Double(back.x + (back.width / 2), back.y,
				back.x + back.width, back.y + (back.height / 2));

		g2.draw(strecha1);
		g2.draw(strecha2);
	}
}
