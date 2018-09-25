package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BullsEye {
	private int polomer;
	private int xSuradnica;
	private int ySuradnica;

	public BullsEye(int polomer, int xSuradnica, int ySuradnica) {
		this.polomer = polomer;
		this.xSuradnica = xSuradnica;
		this.ySuradnica = ySuradnica;
	}

	public void draw(Graphics2D g2) {
		Ellipse2D.Double elipsa = new Ellipse2D.Double();

		for (int i = 0; i < 5; i++) {
			elipsa.setFrame(xSuradnica - (polomer * (1 - (0.2 * i))), ySuradnica - (polomer * (1 - (0.2 * i))),
					polomer * (1 - (0.2 * i)) * 2, polomer * (1 - (0.2 * i)) * 2);
			if (i % 2 == 0) {
				g2.setColor(Color.black);
			} else {
				g2.setColor(Color.white);
			}
			g2.draw(elipsa);
			g2.fill(elipsa);
		}

	}
}

