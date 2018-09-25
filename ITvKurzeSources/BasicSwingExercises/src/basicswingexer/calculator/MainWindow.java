package basicswingexer.calculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainWindow extends JFrame {

	private JTextField field;
	private PanelButtons panel;
	private double result = 0;
	private String prevOpr;
	private String currOpr;

	public MainWindow() {
		// TODO Auto-generated constructor stub
		super("Calculator");
		this.field = new JTextField();
		this.field.setText("0");
		this.field.setEditable(false);
		this.field.setHorizontalAlignment(JTextField.RIGHT);
		this.panel = new PanelButtons();

		setVisible(true);
		setSize(200, 300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		this.setLayout(new BorderLayout());
		add(field, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		panel.setPanelListener(new PanelListener() {

			@Override
			public void occuredButtonEvent(PanelListenerEvent e) {
				String pushButtonCaption = e.getButtonCaption();
				double actValue = Double.valueOf(field.getText());

				switch (pushButtonCaption) {

				case "+":
				case "-":
				case "/":
				case "*":
					prevOpr = pushButtonCaption;
					result = Double.valueOf(field.getText());
					field.setText("0");
					break;

				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					if (field.getText().equals("0")) {
						field.setText(pushButtonCaption);
					} else {
						field.setText(field.getText() + pushButtonCaption);
					}
					break;

				case "=":
					field.setText(String.valueOf(calculate(result, Double.valueOf(field.getText()), prevOpr)));
					break;

				}


			}


			double calculate(double param1, double param2, String oper) {
				double result = 0;
				if (oper.equals("+")) {
					result = param1 + param2;
				}

				if (oper.equals("-")) {
					result = param1 - param2;
				}

				if (oper.equals("*")) {
					result = param1 * param2;
				}

				if (oper.equals("/")) {
					result = param1 / param2;
				}
				return result;
			}
		});


	}

}
