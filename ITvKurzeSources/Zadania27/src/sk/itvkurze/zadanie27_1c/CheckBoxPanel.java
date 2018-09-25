package sk.itvkurze.zadanie27_1c;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel {

	private JCheckBox checkbox;
	private JLabel label;
	
	public CheckBoxPanel(JLabel label) {
		this.label = label;
		this.checkbox = new JCheckBox();
		add(checkbox);
		add(label);
		
	}

	public JCheckBox getCheckBox() {
		return this.checkbox;
	}

	public JLabel getLabel() {
		return this.label;
	}
}
