package sk.itvkurze.zadanie6_17;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Kruznica {
	int polomer;
	int x, y;
	Ellipse2D.Double kruznica;
	Color color;



	public Kruznica(int polomer, int x, int y) {
		this.polomer = polomer;
		this.x = x;
		this.y = y;
		this.kruznica = new Ellipse2D.Double(x - polomer, y - polomer, polomer * 2, polomer * 2);
		this.color = Color.RED;

	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean pretina(Kruznica kruznica) {
		double vzdialenostStredov;
		vzdialenostStredov = Math
				.sqrt(Math.pow((Math.abs(this.x - kruznica.x)), 2) + Math.pow((Math.abs(this.y - kruznica.y)), 2));
		if (vzdialenostStredov < (this.polomer + kruznica.polomer)) {
			return true;
		}
		return false;
	}

	public void nakresli(Graphics2D g2) {

		g2.setColor(this.color);
		g2.fill(this.kruznica);

	}
}



