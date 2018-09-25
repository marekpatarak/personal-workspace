package basicswingexer.calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButtons extends JPanel {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;

	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonPower;
	private JButton buttonDiv;
	private JButton buttonEq;
	private JButton buttonC;

	private PanelListener listener;

	public PanelButtons() {
		// TODO Auto-generated constructor stub
		ActionListener buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelListenerEvent event = new PanelListenerEvent(e.getSource());
				listener.occuredButtonEvent(event);
			}
		};

		this.button0 = new JButton("0");
		button0.addActionListener(buttonListener);
		this.button1 = new JButton("1");
		button1.addActionListener(buttonListener);
		this.button2 = new JButton("2");
		button2.addActionListener(buttonListener);
		this.button3 = new JButton("3");
		button3.addActionListener(buttonListener);
		this.button4 = new JButton("4");
		button4.addActionListener(buttonListener);
		this.button5 = new JButton("5");
		button5.addActionListener(buttonListener);
		this.button6 = new JButton("6");
		button6.addActionListener(buttonListener);
		this.button7 = new JButton("7");
		button7.addActionListener(buttonListener);
		this.button8 = new JButton("8");
		button8.addActionListener(buttonListener);
		this.button9 = new JButton("9");
		button9.addActionListener(buttonListener);

		this.buttonPlus = new JButton("+");
		buttonPlus.addActionListener(buttonListener);
		this.buttonMinus = new JButton("-");
		buttonMinus.addActionListener(buttonListener);
		this.buttonPower = new JButton("*");
		buttonPower.addActionListener(buttonListener);
		this.buttonDiv = new JButton("/");
		buttonDiv.addActionListener(buttonListener);
		this.buttonEq = new JButton("=");
		buttonEq.addActionListener(buttonListener);
		this.buttonC = new JButton("C");
		buttonC.addActionListener(buttonListener);

		setPanelLayout();
	}

	public void setPanelListener(PanelListener listener) {
		this.listener = listener;
	}

	public void setPanelLayout() {
		setLayout(new GridLayout(4, 4));
		add(button7, 0);
		add(button8, 1);
		add(button9, 2);
		add(buttonPlus, 3);
		add(button4, 4);
		add(button5, 5);
		add(button6, 6);
		add(buttonMinus, 7);
		add(button1, 8);
		add(button2, 9);
		add(button3, 10);
		add(buttonPower, 11);
		add(buttonC, 12);
		add(button0, 13);
		add(buttonEq, 14);
		add(buttonDiv, 15);
	}

}

