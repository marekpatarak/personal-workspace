package basicswingexer.calculator;

import java.util.EventObject;

import javax.swing.JButton;

public class PanelListenerEvent extends EventObject {
	String buttonCaption;

	public PanelListenerEvent(Object source) {
		super(source);
		JButton pushButton = (JButton) source;
		this.buttonCaption = pushButton.getActionCommand();
	}

	public String getButtonCaption() {
		return buttonCaption;
	}
}
