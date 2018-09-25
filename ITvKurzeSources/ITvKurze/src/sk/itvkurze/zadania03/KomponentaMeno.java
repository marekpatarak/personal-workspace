package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class KomponentaMeno extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Rectangle obdlznik = new Rectangle(25, 25, 200, 100);
		g2.setColor(new Color(0, 0, 255));
		g2.draw(obdlznik);
		g2.fill(obdlznik);

		g2.setFont(new Font("Arial", Font.PLAIN, 24));
		g2.setColor(new Color(255,0,0));
		g2.drawString("Marek Patarák", 50, 80);

	}
}