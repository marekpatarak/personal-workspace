package sk.itvkurze.swing._13_list_box_praca_s_datami;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
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
	private JList<VekovaKategoria> vekovaKategoria;
	
	private FormularListener listener;
	
	public Formular()
	{
		Dimension rozmery = getPreferredSize();
		rozmery.width = 250;
		setPreferredSize(rozmery);
		
		menoPopisok = new JLabel("Meno: ");
		zamestnaniePopisok = new JLabel("Zamestnanie: ");
		menoTextovePole = new JTextField(10);
		zamestnanieTextovePole = new JTextField(10);
		vekovaKategoria = new JList<VekovaKategoria>();
		
		DefaultListModel<VekovaKategoria> vekModel = new DefaultListModel<VekovaKategoria>();
		vekModel.addElement(new VekovaKategoria(0, "Menej ako 18"));
		vekModel.addElement(new VekovaKategoria(1, "18 az 65"));
		vekModel.addElement(new VekovaKategoria(2, "Viac ako 65"));
		
		vekovaKategoria.setModel(vekModel);
		vekovaKategoria.setPreferredSize(new Dimension(112, 66));
		vekovaKategoria.setBorder(BorderFactory.createEtchedBorder());
		vekovaKategoria.setSelectedIndex(1);
		
		odoslatTlacitko = new JButton("Odoslat");
		odoslatTlacitko.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String meno = menoTextovePole.getText();
				String zamestnanie = zamestnanieTextovePole.getText();
				
				VekovaKategoria vekKategoria = vekovaKategoria.getSelectedValue();
				System.out.println(vekKategoria.getId());
				
				if (listener != null) {
					FormularEvent event = new FormularEvent(this, meno, zamestnanie, vekKategoria.getId());
					listener.nastalaFormularEvent(event);
				}
			}
		});
		
		Border vnutorneOhranicenie = BorderFactory.createTitledBorder("Osobne udaje");
		Border vonkajsieOhranicenie = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(vonkajsieOhranicenie, vnutorneOhranicenie));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		/* PRVY RIADOK */
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 0.1;
		
		gc.gridx = 0;  // 00 lavy horny roh, ak budeme zvysovat hodnotu x - pojdeme zlava doprave, y - zhora nadol
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;				// horizontalne, vertikalne, ziadne alebo oboje
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
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
		gc.weighty = 0.2;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(vekovaKategoria, gc);
		
		/* STVRTY RIADOK */
		
		gc.weightx = 1; // medzera relativne k inym komponentam
		gc.weighty = 2.0;
		
		gc.gridx = 1;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(odoslatTlacitko, gc);
	}

	public void setFormularListener(FormularListener formularListener)
	{
		this.listener = formularListener;
	}
}

/**
 * Jednoducha utility trieda
 */
class VekovaKategoria
{
	/*
	 * Udaj o kategorii, ktory budeme chciet napr. ulozit do databazy
	 */
	private int id;
	
	/*
	 * Text ktory bude zobrazeny pouzivatelovi
	 */
	private String text;
	
	public VekovaKategoria(int id, String text)
	{
		this.id = id;
		this.text = text;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}
	
	@Override
	public String toString()
	{
		return this.text;
	}
}