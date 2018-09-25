package sk.itvkurze.zadanie27_1c;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class PanelFontSetup extends JPanel implements ActionListener {

	private JLabel fontColorChooserLabel;
	private JLabel fontSizeChooserLabel;

	private JComboBox<Integer> fontSizeChooser;
	private JList<FontColor> fontColorChooser;

	private CheckBoxPanel isBold;
	private CheckBoxPanel isCursive;
	private RadioButtonPanel isButtonListen;
	private RadioButtonPanel isKeyListen;

	private JTextField input;
	private JButton doButton;

	private PanelFontSetupListener listener;

	public PanelFontSetup() {


		this.fontColorChooserLabel = new JLabel("Farba pisma: ");
		this.fontSizeChooserLabel = new JLabel("Velkost: ");

		this.fontSizeChooser = new JComboBox<Integer>();
		this.fontColorChooser = new JList<FontColor>();

		this.isBold = new CheckBoxPanel(new JLabel("Bold"));
		this.isCursive = new CheckBoxPanel(new JLabel("Kurziva"));

		this.isButtonListen = new RadioButtonPanel(new JLabel("Activate ButtonListener"));
		this.isKeyListen = new RadioButtonPanel(new JLabel("Activate KeyListener"));
		this.isButtonListen.getRadioButton().setSelected(true);
		this.isKeyListen.getRadioButton().setSelected(false);

		this.isButtonListen.getRadioButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelFontSetup.this.isKeyListen.getRadioButton().setSelected(false);
				PanelFontSetup.this.doButton.setVisible(true);
			}
		});

		this.isKeyListen.getRadioButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelFontSetup.this.isButtonListen.getRadioButton().setSelected(false);
				PanelFontSetup.this.doButton.setVisible(false);

			}
		});

		this.doButton = new JButton("Do IT!");
		this.doButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (PanelFontSetup.this.isButtonListen.getRadioButton().isSelected()) {

				FontColor font = fontColorChooser.getSelectedValue();
				Integer fontSize = (Integer) fontSizeChooser.getSelectedItem();
				boolean jeBold = isBold.getCheckBox().isSelected();
				boolean jeCursive = isCursive.getCheckBox().isSelected();
				String vstup = input.getText();

				if (listener != null) {
					PanelFontSetupEvent event = new PanelFontSetupEvent(this, font, fontSize, jeBold, jeCursive, vstup);
					listener.occuredPanelEvent(event);
				}
			}
			}
		});

		this.input = new JTextField(15);
		this.input.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (PanelFontSetup.this.isKeyListen.getRadioButton().isSelected()) {

				FontColor font = fontColorChooser.getSelectedValue();
				Integer fontSize = (Integer) fontSizeChooser.getSelectedItem();
				boolean jeBold = isBold.getCheckBox().isSelected();
				boolean jeCursive = isCursive.getCheckBox().isSelected();
				String vstup = input.getText();

				if (listener != null) {
					PanelFontSetupEvent event = new PanelFontSetupEvent(this, font, fontSize, jeBold, jeCursive, vstup);
					listener.occuredPanelEvent(event);
				}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

		Border insideBorder = BorderFactory.createTitledBorder("Format pisma");
		Border outsideBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));

		// konfiguracia listobxu
		DefaultListModel<FontColor> fontModel = new DefaultListModel<FontColor>();
		fontModel.addElement(new FontColor(Color.BLACK, "èierna"));
		fontModel.addElement(new FontColor(Color.red, "èervená"));
		fontModel.addElement(new FontColor(Color.BLUE, "modrá"));
		fontModel.addElement(new FontColor(Color.CYAN, "tyrkysová"));
		fontModel.addElement(new FontColor(Color.green, "zelená"));
		fontModel.addElement(new FontColor(Color.magenta, "magenta"));
		fontModel.addElement(new FontColor(Color.ORANGE, "oranžová"));
		fontModel.addElement(new FontColor(Color.PINK, "ružová"));
		fontModel.addElement(new FontColor(Color.YELLOW, "žltá"));

		fontColorChooser.setModel(fontModel);
		fontColorChooser.setBorder(BorderFactory.createEtchedBorder());
		fontColorChooser.setSelectedIndex(0);


		// konfiguracia comboboxu
		DefaultComboBoxModel<Integer> fontSizeModel = new DefaultComboBoxModel<Integer>();

		for (int i = 10; i <= 26; i++) {
			fontSizeModel.addElement(i);
		}

		fontSizeChooser.setModel(fontSizeModel);
		fontSizeChooser.setSelectedIndex(10);
		fontSizeChooser.setEditable(false);

		setLayoutManager();
	}

	public void setPanelListener(PanelFontSetupListener panelListener) {
		this.listener = panelListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private void setLayoutManager() {
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		// PRVY RIADOK

		gc.gridy = 0;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.gridx = 0;

		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 10, 0, 5);
		add(fontColorChooserLabel, gc);

		gc.gridx = 1;

		gc.anchor = GridBagConstraints.LINE_START;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(0, 0, 10, 50);

		JScrollPane scrollPane = new JScrollPane(fontColorChooser);
		scrollPane.setSize(new Dimension(60, 40));
		add(scrollPane, gc);

		// DRUHY RIADOK

		gc.gridy++;

		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 0.1;

		gc.gridx = 0;

		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 10, 0, 5);
		add(fontSizeChooserLabel, gc);

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 10, 5);
		add(fontSizeChooser, gc);

		// TRETI RIADOK

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 10, 10, 5);
		add(isBold, gc);


		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 10, 5);
		add(isCursive, gc);

		// STVRTY RIADOK

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 10, 10, 5);
		add(isButtonListen, gc);

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 10, 5);
		add(isKeyListen, gc);

		// PIATY RIADOK

		gc.gridy++;

		gc.weightx = 0;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 10, 10, 10);
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(input, gc);

		// SIESTY RIADOK

		gc.gridy++;

		gc.weightx = 0.1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.fill = GridBagConstraints.NONE;
		gc.insets = new Insets(0, 10, 10, 5);
		add(doButton, gc);

	}

	}


