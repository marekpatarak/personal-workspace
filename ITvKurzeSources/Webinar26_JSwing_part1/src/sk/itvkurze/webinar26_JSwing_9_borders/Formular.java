package sk.itvkurze.webinar26_JSwing_9_borders;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Formular extends JPanel {

	public Formular() {
		// nastavovanie rozmerov componentu
		Dimension rozmery = getPreferredSize();
		rozmery.width = 250;
		setPreferredSize(rozmery);

		// 1) jednoduche ohranicenie s popisom
		// setBorder(BorderFactory.createTitledBorder("Osobne udaje"));

		// 2) zlozene ohranicenie vonkajsie prazdne + vnutorne
		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Osobne udaje");
		// odsadenie v pixeloch
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));

		// 3) v PanelNastrojov


	}
}
