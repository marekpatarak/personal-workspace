package sk.itvkurze.webinar26_JSwing_4_vlast_komponenta;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PlochaTextAutoScrollBar extends JPanel {

	private JTextArea plochaTextu;

	public PlochaTextAutoScrollBar() {
		plochaTextu = new JTextArea();

		// nastavenie Layoutu vlastneho JPanelu
		setLayout(new BorderLayout());

		// pridanie scrollbaru (parameter je TextArea) do JPanelu, v pripade potreby
		// bude scrollovat
		add(new JScrollPane(plochaTextu), BorderLayout.CENTER);

	}

	public void vlozText(String text) {
		plochaTextu.append(text);
	}
}
