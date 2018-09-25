package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class KomponentaTvar extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		// ziskame graficky kontext
		Graphics2D g2 = (Graphics2D) g;

		// najprv si vytvorime hlavu mimozemstana
		Ellipse2D.Double hlava = new Ellipse2D.Double(5, 10, 100, 150);
		g2.draw(hlava);

		// nasledne si zobrazime oci
		Line2D.Double laveOko = new Line2D.Double(25, 70, 45, 90);
		g2.draw(laveOko);

		Line2D.Double praveOko = new Line2D.Double(85, 70, 65, 90);
		g2.draw(praveOko);

		// aky by to bol mimozemstan bez ust . . .
		Rectangle usta = new Rectangle(30, 130, 50, 5);
		g2.setColor(Color.GREEN);
		g2.fill(usta);

		// aby toho nebolo malo, tak si ukazeme ako vypisat retazec
		// do grafickej komponenty
		g2.drawString("Volam sa Shrek", 5, 175);
	}
}