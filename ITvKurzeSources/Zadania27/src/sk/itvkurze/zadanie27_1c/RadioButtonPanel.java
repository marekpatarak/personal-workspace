package sk.itvkurze.zadanie27_1c;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonPanel extends JPanel {

	private JRadioButton radiobuton;
	private JLabel label;
	
	public RadioButtonPanel(JLabel label) {
		this.label = label;
		this.radiobuton = new JRadioButton();
		add(radiobuton);
		add(label);
		
	}

	public JRadioButton getRadioButton() {
		return this.radiobuton;
	}

	public JLabel getLabel() {
		return this.label;
	}
}
