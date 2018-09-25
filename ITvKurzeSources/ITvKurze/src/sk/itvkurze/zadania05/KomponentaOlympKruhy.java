package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaOlympKruhy extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		// modry kruh
		OlympKruh kruh = new OlympKruh(200, 200, Color.blue);
		kruh.nakresliKruh(g2);

		// cierny kruh
		kruh.posunKruh(200, 0);
		kruh.setFarba(Color.BLACK);
		kruh.nakresliKruh(g2);

		// cerveny kruh
		kruh.posunKruh(200, 0);
		kruh.setFarba(Color.RED);
		kruh.nakresliKruh(g2);

		// zeleny kruh
		kruh.posunKruh(-100, 100);
		kruh.setFarba(Color.green);
		kruh.nakresliKruh(g2);

		// zlty kruh
		kruh.posunKruh(-200, 0);
		kruh.setFarba(Color.yellow);
		kruh.nakresliKruh(g2);
	}
}