package sk.itvkurze.zadanie27_1d;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainWindow extends JFrame {

	private PanelFontSetup panel;
	private JLabel output;

	public MainWindow() {
		super("Okno s vlastnostami pisma");

		setSize(600, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);

		this.panel = new PanelFontSetup();
		this.output = new JLabel(">>Tu sa vypise formatovany text<<");

		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Output:");
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		output.setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));

		panel.setPanelListener(new PanelFontSetupListener() {

			@Override
			public void occuredPanelEvent(PanelFontSetupEvent event) {
				String vstup = event.getInput();

				output.setFont(PanelFontSetupEvent.getFont(event));
				output.setForeground(event.getColor());
				output.setText(vstup);
			}


		});

		setLayout(new BorderLayout());

		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);



	}

}
