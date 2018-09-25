package sk.itvkurze.webinar04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class Domcek extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle obdlz = new Rectangle(100, 100, 200, 100);
		g2.draw(obdlz);

		g2.setColor(new Color(255, 0, 200));
		Rectangle stvorec = new Rectangle(125, 150, 50, 50);
		g2.fill(stvorec);
	}

}
