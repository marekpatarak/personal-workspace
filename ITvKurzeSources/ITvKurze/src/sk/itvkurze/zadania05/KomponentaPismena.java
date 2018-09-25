package sk.itvkurze.zadania05;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaPismena extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Pismeno pismenoH = new PismenoH(50, 50, 100, 150);
		pismenoH.nakresli(g2);

		Pismeno pismenoE = new PismenoE(175, 50, 100, 150);
		pismenoE.nakresli(g2);

		Pismeno pismenoL = new PismenoL(300, 50, 100, 150);
		pismenoL.nakresli(g2);

		Pismeno pismenoL2 = new PismenoL(425, 50, 100, 150);
		pismenoL2.nakresli(g2);

		Pismeno pismenoO = new PismenoO(550, 50, 100, 150);
		pismenoO.nakresli(g2);

	}
}