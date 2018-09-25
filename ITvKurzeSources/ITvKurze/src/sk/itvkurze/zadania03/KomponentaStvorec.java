package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class KomponentaStvorec extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle stvorec = new Rectangle(0, 0, 150, 150);

		g2.setColor(Color.PINK);
		g2.draw(stvorec);
		g2.fill(stvorec);

		stvorec.translate(0, 150);
		Color lubovolnaFarba = new Color(255, 215, 0);
		g2.setColor(lubovolnaFarba);
		g2.draw(stvorec);
		g2.fill(stvorec);

	}
}