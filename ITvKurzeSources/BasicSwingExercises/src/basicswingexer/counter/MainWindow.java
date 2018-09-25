package basicswingexer.counter;

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
	private JButton button;

	public MainWindow() {
		// TODO Auto-generated constructor stub
		super("Counter");
		this.label = new JLabel("Counter");
		this.field = new JTextField(10);
		this.field.setText("0");
		this.field.setEditable(false);
		this.button = new JButton("Count");

		setVisible(true);
		setSize(300, 100);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		this.setLayout(new FlowLayout());
		add(label);
		add(field);
		add(button);

		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pushedButton = (JButton) e.getSource();
		int actValue = Integer.valueOf(field.getText());
		actValue++;
		field.setText(String.valueOf(actValue));

	}

}
