package sk.itvkurze.swing._10_gird_bag_layout;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Formular extends JPanel
{
	private JLabel menoPopisok;
	private JLabel zamestnaniePopisok;
	private JTextField menoTextovePole;
	private JTextField zamestnanieTextovePole;
	private JButton odoslatTlacitko;
	
	public Formular()
	{
		Dimension rozmery = getPreferredSize();
		rozmery.width = 250;
		setPreferredSize(rozmery);
		
		menoPopisok = new JLabel("Meno: ");
		zamestnaniePopisok = new JLabel("Zamestnanie: ");
		menoTextovePole = new JTextField(10);
		zamestnanieTextovePole = new JTextField(10);
		
		odoslatTlacitko = new JButton("Odoslat");
		
		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Osobne udaje");
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));
		
		// nastavenie GridBagLayoutu
		setLayout(new GridBagLayout());
		
		// ohranicenie componentov
		GridBagConstraints gc = new GridBagConstraints();
		
		/* PRVY RIADOK */
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 0.1;
		
		gc.gridx = 0;  // 00 lavy horny roh, ak budeme zvysovat hodnotu x - pojdeme zlava doprave, y - zhora nadol
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		// horizontalne, vertikalne, ziadne alebo oboje
		// fill riesi co sa ma stat ked sa komponenta uz nezmesti do priestoru
		gc.anchor = GridBagConstraints.LINE_END;
		// kam sa ma upnut
		gc.insets = new Insets(0, 0, 0, 5);
		// dalsi sposob vynutenia medzery medzi komponenntami
		// toto konkretne 5 pixelov z prava
		add(menoPopisok, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(menoTextovePole, gc);
		
		/* DRUHY RIADOK */
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(zamestnaniePopisok, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(zamestnanieTextovePole, gc);
		
		/* TRETI RIADOK */
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 2.0;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		// priame nastavenie rozmerov komponenty
		gc.ipadx = 50;
		gc.ipady = 50;

		add(odoslatTlacitko, gc);
	}
}
