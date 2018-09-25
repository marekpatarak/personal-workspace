package sk.itvkurze.zadanie7_10;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaKruznice extends JComponent {
	int n;
	public KomponentaKruznice(int n) {
		this.n = n;
	}

	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Kruznice kruznice = new Kruznice(this.getWidth(), this.getHeight());

		for (int i = 1; i <= this.n; i++) {
		kruznice.nakresli(g2);
		}

	}
}