package basicswingexer.enhancounter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {

	private JLabel label;
	private JTextField field;
	private JButton countUp;
	private JButton countDown;
	private JButton reset;

	public MainWindow() {
		// TODO Auto-generated constructor stub
		super("Counter");
		this.label = new JLabel("Counter");
		this.field = new JTextField(10);
		this.field.setText("0");
		this.field.setEditable(false);
		this.countUp = new JButton("CountUp");
		this.countDown = new JButton("CountDown");
		this.reset = new JButton("Reset");


		setVisible(true);
		setSize(500, 100);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		this.setLayout(new FlowLayout());
		add(label);
		add(field);
		add(countUp);
		add(countDown);
		add(reset);

		countUp.addActionListener(this);
		countDown.addActionListener(this);
		reset.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pushedButton = (JButton) e.getSource();
		int actValue = Integer.valueOf(field.getText());

		if (pushedButton.equals(countUp)) {
			actValue++;
		} else if (pushedButton.equals(countDown)) {
			actValue--;
		} else if (pushedButton.equals(reset)) {
			actValue = 0;
		}

		field.setText(String.valueOf(actValue));

	}

}
