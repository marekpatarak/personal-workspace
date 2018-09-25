package sk.itvkurze.swing._27_popup_menu.gui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sk.itvkurze.swing._27_popup_menu.model.Osoba;

public class TabulkaPanel extends JPanel
{
	private JTable tabulka;
	private OsobaTabulkaModel tabulkaModel;
	private JPopupMenu popup;
	
	public TabulkaPanel()
	{
		tabulkaModel = new OsobaTabulkaModel();
		tabulka = new JTable(tabulkaModel);
		popup = new JPopupMenu();
		
		JMenuItem zmazItem = new JMenuItem("Zmaz riadok");
		popup.add(zmazItem);
		
		tabulka.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				// prave tlacitko je BUTTON3
				if (e.getButton() == MouseEvent.BUTTON3)
				{
					popup.show(tabulka, e.getX(), e.getY());
				}
			}
		});
		
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
