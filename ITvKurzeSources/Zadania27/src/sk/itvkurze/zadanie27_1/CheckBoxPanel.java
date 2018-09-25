package sk.itvkurze.zadanie27_1;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel {

	private JCheckBox checkbox;
	private JLabel label;
	
	public CheckBoxPanel(JLabel label) {
		this.label = label;
		this.checkbox = new JCheckBox();
		add(label);
		add(checkbox);
		
	}

	public JCheckBox getCheckBox() {
		return this.checkbox;
	}

	public JLabel getLabel() {
		return this.label;
	}
}
