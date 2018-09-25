package sk.itvkurze.zadania03;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TesterOkna {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(400, 400);
		JTextField text = new JTextField("Ahoj, Marek Patarák");
		text.setBackground(Color.ORANGE);

		okno.add(text);

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
	}
}