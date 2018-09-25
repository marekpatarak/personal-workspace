package sk.itvkurze.swing._43_jsplitpane.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class PanelSNastrojmi extends JToolBar implements ActionListener
{
	private JButton ulozTlacitko;
	private JButton refreshTlacitko;
	private PanelSNastrojmiListener listener;
	
	public PanelSNastrojmi() 
	{
		ulozTlacitko = new JButton();
		// adresar nemusi byt sucastou projektu, ale je potrebne aby bol na classpath
		ulozTlacitko.setIcon(vytvorIkonku("../obrazky/save.gif"));
		ulozTlacitko.setToolTipText("Uloz");
		
		refreshTlacitko = new JButton();
		refreshTlacitko.setIcon(vytvorIkonku("../obrazky/refresh.gif"));
		refreshTlacitko.setToolTipText("Refresh");
		
		ulozTlacitko.addActionListener(this);
		refreshTlacitko.addActionListener(this);
		
		add(ulozTlacitko);
		addSeparator();			// vlozi medzeru medzi komponenty
		add(refreshTlacitko);
	}

	public void setPanelSNastrojmiListener(PanelSNastrojmiListener listener)
	{
		this.listener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// potrebujeme rozlisit, na ktore tlacitko sme klikli ...
		JButton stlaceneTlacitko = (JButton) e.getSource();
		
		if (stlaceneTlacitko == ulozTlacitko)
		{
			if (listener != null)
			{
				listener.nastalaUlozEvent();
			}
		}
		else if (stlaceneTlacitko == refreshTlacitko)
		{
			if (listener != null)
			{
				listener.nastalaRefreshEvent();
			}
		}
		
	}
	
	private  ImageIcon vytvorIkonku(String cesta)
	{
		// pomocou class loadera nacitame z danej cesty resources, v nasom pripade obrazky
		URL url = getClass().getResource(cesta);
		
		if(url == null)
		{
			System.err.println("NIe je mozne nacitat obrazok z umiestnenia: " + cesta);
		}
		
		ImageIcon ikonka = new ImageIcon(url);
		
		return ikonka;
	}
}
