package sk.itvkurze.zadanie6_17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaPretinKruznice extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Kruznica kruznica1 = new Kruznica(ZobrazovacPretinKruznice.polomer1, 300, 300);
		Kruznica kruznica2 = new Kruznica(ZobrazovacPretinKruznice.polomer2, 500, 500);

		if (kruznica1.pretina(kruznica2)) {
			kruznica1.setColor(Color.GREEN);
			kruznica2.setColor(Color.GREEN);
		}

		kruznica1.nakresli(g2);
		kruznica2.nakresli(g2);

	}
}