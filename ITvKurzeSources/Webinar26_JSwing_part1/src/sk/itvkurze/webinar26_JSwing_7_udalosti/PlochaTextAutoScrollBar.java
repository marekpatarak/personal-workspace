package sk.itvkurze.webinar26_JSwing_7_udalosti;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PlochaTextAutoScrollBar extends JPanel {

	private JTextArea plochaTextu;

	public PlochaTextAutoScrollBar() {
		plochaTextu = new JTextArea();

		setLayout(new BorderLayout());

		add(new JScrollPane(plochaTextu), BorderLayout.CENTER);

	}

	public void vlozText(String text) {
		plochaTextu.append(text);
	}
}
