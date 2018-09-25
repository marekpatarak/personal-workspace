package sk.itvkurze.zadanie27_1c;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainWindow extends JFrame {

	private PanelFontSetup panel;
	private JLabel output;

	public MainWindow() {
		super("Okno s vlastnostami pisma");

		setSize(500, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		this.panel = new PanelFontSetup();
		this.output = new JLabel(">>Tu sa vypise formatovany text<<");

		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Output:");
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		output.setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));

		panel.setPanelListener(new PanelFontSetupListener() {

			@Override
			public void occuredPanelEvent(PanelFontSetupEvent event) {
				String vstup = event.getInput();

				output.setFont(getFont(event));
				output.setForeground(event.getFont().getColor());
				output.setText(vstup);
			}

			public Font getFont(PanelFontSetupEvent event) {
				Font nastFont = new Font(event.getFont().toString(), Font.PLAIN, event.getFontSize());

				if (event.getIsBold() == true && event.getIsCursive() == true) {
					nastFont = new Font(event.getFont().toString(), Font.BOLD | Font.ITALIC, event.getFontSize());
				} else {

					if (event.getIsBold() == true && event.getIsCursive() == false) {
						nastFont = new Font(event.getFont().toString(), Font.BOLD, event.getFontSize());
					}
					if (event.getIsBold() == false && event.getIsCursive() == true) {
						nastFont = new Font(event.getFont().toString(), Font.ITALIC, event.getFontSize());
					}
				}

				return nastFont;
			}

		});

		setLayout(new BorderLayout());

		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);



	}

}
