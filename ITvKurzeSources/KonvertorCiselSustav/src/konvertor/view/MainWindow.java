package konvertor.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener
{
	private JButton buttonDecToBin;
	private JButton buttonDecToHex;
	private JButton buttonDecToOct;
	private JButton buttonHexToBin;
	private JButton buttonHexToDec;
	private JButton buttonHexToOct;
	private JButton buttonOctToBin;
	private JButton buttonOctToDec;
	private JButton buttonOctToHex;
	private JTextField vstup;
	private JTextField vystup;
	private JLabel popisVstup;
	private JLabel popisVystup;

	public MainWindow()
	{
		super("Konvertor ciselnych sustav");

		buttonDecToBin = new JButton("DecToBin");
		buttonDecToHex = new JButton("DecToHex");
		buttonDecToOct = new JButton("DecToOct");
		buttonHexToBin = new JButton("HexToBin");
		buttonHexToDec = new JButton("HexToDec");
		buttonHexToOct = new JButton("HexToOct");
		buttonOctToBin = new JButton("OctToBin");
		buttonOctToDec = new JButton("OctToDec");
		buttonOctToHex = new JButton("OctToHex");
		vstup = new JTextField(15);
		vystup = new JTextField(15);
		popisVstup = new JLabel("Vstup:");
		popisVystup = new JLabel("Vystup:");
		
		buttonDecToBin.addActionListener(this);
		buttonDecToHex.addActionListener(this);
		buttonDecToOct.addActionListener(this);
		buttonHexToBin.addActionListener(this);
		buttonHexToDec.addActionListener(this);
		buttonHexToOct.addActionListener(this);
		buttonOctToBin.addActionListener(this);
		buttonOctToDec.addActionListener(this);
		buttonOctToHex.addActionListener(this);

		setLayout(new GridBagLayout());
		
		/* PRVY RIADOK */
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 0.5;
		gc.weighty = 5;
		gc.gridx = 0;
		gc.gridy = 0;
		add(popisVstup, gc);

		gc.weightx = 0.5;
		gc.weighty = 10;
		gc.gridx = 1;
		gc.gridy = 0;
		add(vstup, gc);

		/* Druhy RIADOK */

		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.NORTH;
		add(popisVystup, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.NORTH;
		add(vystup, gc);

		/* treti RIADOK */


		gc.gridx = 0;
		gc.gridy = 2;
		add(buttonDecToBin, gc);

		gc.gridx = 1;
		gc.gridy = 2;
		add(buttonDecToHex, gc);

		gc.gridx = 2;
		gc.gridy = 2;
		add(buttonDecToOct, gc);

		/* stvrty RIADOK */
		gc.gridx = 0;
		gc.gridy = 3;
		add(buttonHexToBin, gc);

		gc.gridx = 1;
		gc.gridy = 3;
		add(buttonHexToDec, gc);

		gc.gridx = 2;
		gc.gridy = 3;
		add(buttonHexToOct, gc);

		/* piaty RIADOK */
		gc.gridx = 0;
		gc.gridy = 4;
		add(buttonOctToBin, gc);

		gc.gridx = 1;
		gc.gridy = 4;
		add(buttonOctToDec, gc);

		gc.gridx = 2;
		gc.gridy = 4;
		add(buttonOctToHex, gc);

		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton stlaceneTlacitko = (JButton) e.getSource();

	}
}
