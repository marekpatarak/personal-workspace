package sk.itvkurze.zadanie6_16;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class KruznicaBod {
	double polomer;
	double x, y;
	Ellipse2D.Double kruznica;
	Color color;



	public KruznicaBod(double polomer, double x, double y) {
		this.polomer = polomer;
		this.x = x;
		this.y = y;
		this.kruznica = new Ellipse2D.Double(x - polomer, y - polomer, polomer * 2, polomer * 2);
		this.color = Color.BLACK;

	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean obsahuje(Point2D.Double bod) {
		double vzdialenostStredov;
		vzdialenostStredov = Math
				.sqrt(Math.pow((Math.abs(this.x - bod.x)), 2) + Math.pow((Math.abs(this.y - bod.y)), 2));
		if (vzdialenostStredov < (this.polomer)) {
			return true;
		}
		return false;
	}

	public void nakresli(Graphics2D g2) {

		g2.setColor(this.color);
		g2.draw(this.kruznica);

	}
}



