package sk.itvkurze.zadanie7_8;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaOpilec extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Opilec opilec = new Opilec();
		opilec.nakresliStvrt(g2);

		opilec.nakresliPoziciu(g2);

		while (opilec.getX() > 100 || opilec.getY() > 100) {
			opilec.spravKrok();
			opilec.nakresliPoziciu(g2);
		}

	}
}