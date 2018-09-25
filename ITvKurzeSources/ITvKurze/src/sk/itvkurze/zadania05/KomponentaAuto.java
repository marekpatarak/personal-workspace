package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaAuto extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Auto audi = new Auto(50, 50, 100, 60, Color.blue);
		audi.nakresli(g2);

		// 3.nasobna velkost
		Auto bmw = new Auto(400, 300, 300, 180, Color.MAGENTA);
		bmw.nakresli(g2);

		// 2.nasobna velkost
		Auto ferrari = new Auto(200, 500, 200, 120, Color.red);
		ferrari.nakresli(g2);
	}
}