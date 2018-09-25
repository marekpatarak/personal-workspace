package sk.itvkurze.zadania05;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;


public class PismenoH extends Pismeno {

	public PismenoH(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void nakresli(Graphics2D g2) {
		Line2D.Double ciara = new Line2D.Double(this.hornyRohX, this.hornyRohY, this.hornyRohX,
				this.hornyRohY + this.height);
		Line2D.Double ciara2 = new Line2D.Double(this.hornyRohX, this.hornyRohY + this.height / 2,
				this.hornyRohX + this.width, this.hornyRohY + this.height / 2);
		Line2D.Double ciara3 = new Line2D.Double(this.hornyRohX + this.width, this.hornyRohY,
				this.hornyRohX + this.width, this.hornyRohY + this.height);

		g2.draw(ciara);
		g2.draw(ciara2);
		g2.draw(ciara3);
	}


}
