package sk.itvkurze.zadanie6_16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class KomponentaPretinKruznicaBod extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		KruznicaBod kruznica1 = new KruznicaBod(100, 200, 200);
		Point2D.Double bod = new Point2D.Double(ZobrazovacPretinKruznicaBod.bodX, ZobrazovacPretinKruznicaBod.bodY);
		KruznicaBod kruznicaBodu = new KruznicaBod(10, bod.getX(), bod.getY());

		if (kruznica1.obsahuje(bod)) {
			kruznicaBodu.setColor(Color.GREEN);
		} else {
			kruznicaBodu.setColor(Color.RED);
		}

		kruznica1.nakresli(g2);
		kruznicaBodu.nakresli(g2);

	}
}