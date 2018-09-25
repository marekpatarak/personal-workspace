package sk.itvkurze.zadania05;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaBullsEye extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		int polomer = 100;
		int xSuradnica = 200;
		int ySuradnica = 200;

		BullsEye bullsEye = new BullsEye(polomer, xSuradnica, ySuradnica);

		bullsEye.draw(g2);

	}
}