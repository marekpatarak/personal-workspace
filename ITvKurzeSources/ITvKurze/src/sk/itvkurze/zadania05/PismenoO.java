package sk.itvkurze.zadania05;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class PismenoO extends Pismeno {

	public PismenoO(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void nakresli(Graphics2D g2) {
		Ellipse2D.Double elipsa = new Ellipse2D.Double(this.hornyRohX, this.hornyRohY, this.width, this.height);

		g2.draw(elipsa);

	}


}
