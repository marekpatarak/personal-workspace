package sk.theory.jswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JSwingTester {

	public static void main(String[] args) {
		// crating instance of JFrame
		JFrame f = new JFrame("Window");

		// crating instance of clickable button
		JButton b = new JButton("Click");
		b.setBounds(130, 100, 100, 40);


		// creating instance of check button
		JRadioButton b2 = new JRadioButton("Click");
		b2.setBounds(230, 200, 100, 40);

		// creating instance of check button
		JTextArea b3 = new JTextArea("Click");
		b3.setBounds(0, 0, 100, 40);

		f.add(b);
		f.add(b2);
		f.add(b3);

		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

}
