package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class KomponentaElipsa extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double elipsa = new Ellipse2D.Double(0, 0, this.getWidth(), this.getHeight());

		g2.draw(elipsa);
		g2.setColor(Color.orange);
		g2.fill(elipsa);

	}
}