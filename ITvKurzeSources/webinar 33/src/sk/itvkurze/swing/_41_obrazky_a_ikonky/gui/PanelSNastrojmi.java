package sk.itvkurze.swing._41_obrazky_a_ikonky.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSNastrojmi extends JPanel implements ActionListener
{
	private JButton ulozTlacitko;
	private JButton refreshTlacitko;
	private PanelSNastrojmiListener listener;
	
	public PanelSNastrojmi() 
	{
		ulozTlacitko = new JButton("Uloz");
		// adresar nemusi byt sucastou projektu, ale je potrebne aby bol na classpath
		ulozTlacitko.setIcon(vytvorIkonku("../obrazky/save.gif"));
		
		refreshTlacitko = new JButton("Refresh");
		refreshTlacitko.setIcon(vytvorIkonku("../obrazky/refresh.gif"));
		
		ulozTlacitko.addActionListener(this);
		refreshTlacitko.addActionListener(this);
		
		// 3) jednoduche ohranicenie
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(ulozTlacitko);
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
