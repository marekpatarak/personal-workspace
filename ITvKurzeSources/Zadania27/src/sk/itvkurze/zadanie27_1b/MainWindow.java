package sk.itvkurze.zadanie27_1b;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainWindow extends JFrame {

	private PanelFontSetup panel;
	private JLabel output;

	public MainWindow() {
		super("Okno s vlastnostami pisma");

		setSize(400, 550);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		this.panel = new PanelFontSetup();
		this.output = new JLabel(">>Tu sa vypise formatovany text<<");

		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Output:");
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		output.setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));
		output.setSize(this.getWidth(), 40);


		panel.setPanelListener(new PanelFontSetupListener() {

			@Override
			public void occuredPanelEvent(PanelFontSetupEvent event) {
				FontColor fontColor = event.getFont();
				Integer fontSize = event.getFontSize();
				boolean jeBold = event.getIsBold();
				boolean jeCursive = event.getIsCursive();

				String vstup = event.getInput();
				// String str = "<html><font size=\"6\"><span style=\"font-family:times;\">" +
				// vstup
				// + "</font></span></html>";

				output.setFont(getFont(event));
				output.setForeground(fontColor.getColor());
				output.setText(vstup);
				System.out.println(
						fontColor.getColorName() + ": " + fontSize + ": " + jeBold + ", " + jeCursive + ", " + vstup);
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

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		// PRVY RIADOK

		gc.gridy = 0;

		gc.weightx = 0.1; // medzera relativne k inym komponentam
		gc.weighty = 1;

		gc.gridx = 0; // 00 lavy horny roh, ak budeme zvysovat hodnotu x - pojdeme zlava doprave, y -
						// zhora nadol

		gc.fill = GridBagConstraints.HORIZONTAL; // horizontalne, vertikalne, ziadne alebo
		// oboje
		// gc.ipadx = 500;
		// gc.ipady = 300;

		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0, 0, 0, 0);
		add(panel, gc);

		// DRUHY RIADOK

		gc.gridy++;

		gc.weightx = 0.1; // medzera relativne k inym komponentam
		gc.weighty = 1;

		gc.gridx = 0;

		gc.fill = GridBagConstraints.HORIZONTAL; // horizontalne, vertikalne, ziadne alebo
		gc.anchor = GridBagConstraints.SOUTH;
		// gc.ipadx = 600;
		// gc.ipady = 200;
		gc.insets = new Insets(0, 0, 0, 0);
		add(output, gc);


	}

}
