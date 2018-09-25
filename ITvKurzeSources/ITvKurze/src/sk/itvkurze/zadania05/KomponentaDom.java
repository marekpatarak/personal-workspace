package sk.itvkurze.zadania05;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaDom extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Dom dom = new Dom(50, 50, 200, 200);
		dom.nakresli(g2);

		Dom dom2 = new Dom(300, 300, 100, 200);
		dom2.nakresli(g2);

		Dom dom3 = new Dom(350, 100, 100, 50);
		dom3.nakresli(g2);
	}
}