package sk.itvkurze.zadania05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaStlpec extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		// 1.stlpec
		Stlpec goldenGate = new Stlpec("Golden Gate", 50, 1270, Color.BLUE);
		goldenGate.nakresliStlpec(g2);

		// 2.stlpec
		Stlpec brooklyn = new Stlpec("Brooklyn", 200, 483, Color.RED);
		brooklyn.nakresliStlpec(g2);

		// 3.stlpec
		Stlpec delawareMemorial = new Stlpec("Delaware Memorial", 350, 651, Color.BLUE);
		delawareMemorial.nakresliStlpec(g2);

		// 4.stlpec
		Stlpec mackinac = new Stlpec("Mackinac", 500, 1151, Color.RED);
		mackinac.nakresliStlpec(g2);

	}
}