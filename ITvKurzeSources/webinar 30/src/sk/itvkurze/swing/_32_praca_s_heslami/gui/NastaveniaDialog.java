package sk.itvkurze.swing._32_praca_s_heslami.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class NastaveniaDialog extends JDialog
{
	private JButton okTlacitko;
	private JButton zrusTlacitko;
	private JSpinner portSpinner;
	private SpinnerNumberModel spinnerModel;
	private JTextField prihlasovacieMeno;
	private JPasswordField heslo;
	
	public NastaveniaDialog(JFrame rodic)
	{
		super(rodic, "Vlastnosti", false);
		
		okTlacitko = new JButton("OK");
		zrusTlacitko = new JButton("Zrus");
		
		spinnerModel = new SpinnerNumberModel(3306, 0, 9999, 1);
		portSpinner = new JSpinner(spinnerModel);
		
		prihlasovacieMeno = new JTextField(10);
		heslo = new JPasswordField(10);
		heslo.setEchoChar('*');
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridy = 0;
		
		/* Prvy riadok */
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		gc.gridx = 0;
		add(new JLabel("Prihlasovacie meno: "), gc);
		
		gc.gridx++;
		add(prihlasovacieMeno, gc);
		
		/* Dalsi riadok */
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		gc.gridx = 0;
		
		add(new JLabel("Helo: "), gc);
		
		gc.gridx++;
		add(heslo, gc);
		
		/* Dalsi riadok */
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		gc.gridx = 0;
		
		add(new JLabel("Port: "), gc);
		
		gc.gridx++;
		add(portSpinner, gc);
		
		/* Dalsi riadok */
		
		gc.gridy++;
		
		gc.gridx = 0;
		add(okTlacitko, gc);
		
		gc.gridx++;
		add(zrusTlacitko, gc);
		
		okTlacitko.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// vytvorili sme si spinner v ktorom pracujeme s celymi cislami z intervalu 0 az 9999
				Integer hodnota = (Integer) portSpinner.getValue();
				System.out.println("Hodnota spinnera: " + hodnota);
				
				String pouzivatelskeMeno = prihlasovacieMeno.getText();
				char[] pouzivatelskeHeslo = heslo.getPassword();
				
				// 1. moznost new String(pouzivatelskeHeslo)
				// 2. moznost Arrays.toString(pouzivatelskeHeslo)
				System.out.println(pouzivatelskeMeno + ": " + String.copyValueOf(pouzivatelskeHeslo));
				
				setVisible(false);
			}
		});
		
		zrusTlacitko.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});
		
		setSize(400, 300);
		setLocationRelativeTo(rodic);
	}
}
