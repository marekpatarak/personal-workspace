package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class KomponentaEmotikon extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		int width = this.getWidth();
		int height = this.getHeight();

		Ellipse2D.Double hlava = new Ellipse2D.Double(0, 0, width, height);
		Ellipse2D.Double laveOko = new Ellipse2D.Double(width * 0.2, height * 0.2, width / 4, height / 4);
		Ellipse2D.Double lavaZrenica = new Ellipse2D.Double(width * 0.3, height * 0.3, width / 12, height / 12);
		Ellipse2D.Double praveOko = new Ellipse2D.Double(width * 0.55, height * 0.2, width / 4, height / 4);
		Ellipse2D.Double pravaZrenica = new Ellipse2D.Double(width * 0.617, height * 0.3, width / 12, height / 12);
		Ellipse2D.Double usta = new Ellipse2D.Double(width * 0.2, height * 0.6, width * 0.6, height / 4);

		g2.setColor(Color.YELLOW);
		g2.draw(hlava);
		g2.fill(hlava);

		g2.setColor(Color.WHITE);
		g2.draw(laveOko);
		g2.fill(laveOko);
		g2.draw(praveOko);
		g2.fill(praveOko);

		g2.setColor(Color.BLACK);
		g2.draw(lavaZrenica);
		g2.fill(lavaZrenica);
		g2.draw(pravaZrenica);
		g2.fill(pravaZrenica);

		g2.setColor(Color.RED);
		g2.draw(usta);
		g2.fill(usta);

		usta.y = height * 0.5;

		g2.setColor(Color.YELLOW);
		g2.draw(usta);
		g2.fill(usta);

	}
}