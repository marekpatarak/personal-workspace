package sk.itvkurze.swing._26_serializacia_dat.gui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sk.itvkurze.swing._26_serializacia_dat.model.Osoba;


public class TabulkaPanel extends JPanel
{
	private JTable tabulka;
	private OsobaTabulkaModel tabulkaModel;
	
	public TabulkaPanel()
	{
		tabulkaModel = new OsobaTabulkaModel();
		tabulka = new JTable(tabulkaModel);
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(tabulka), BorderLayout.CENTER);
	}
	
	
	
	public void setData(List<Osoba> osoby)
	{
		tabulkaModel.setData(osoby);
	}
	
	public void refresh()
	{
		tabulkaModel.fireTableDataChanged();
	}
}
