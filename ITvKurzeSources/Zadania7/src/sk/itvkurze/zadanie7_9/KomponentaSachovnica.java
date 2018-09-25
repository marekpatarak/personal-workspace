package sk.itvkurze.zadanie7_9;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaSachovnica extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Sachovnica sachovnica = new Sachovnica(this.getWidth(), this.getHeight());
		sachovnica.nakresliSachovnicu(g2);


	}
}