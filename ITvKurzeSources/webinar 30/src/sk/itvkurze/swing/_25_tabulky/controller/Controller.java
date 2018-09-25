package sk.itvkurze.swing._25_tabulky.controller;

import java.util.List;

import sk.itvkurze.swing._25_tabulky.gui.FormularEvent;
import sk.itvkurze.swing._25_tabulky.model.Databaza;
import sk.itvkurze.swing._25_tabulky.model.Osoba;
import sk.itvkurze.swing._25_tabulky.model.Pohlavie;
import sk.itvkurze.swing._25_tabulky.model.VekovaKategoria;
import sk.itvkurze.swing._25_tabulky.model.ZamestnaneckyStatus;

public class Controller
{
	Databaza db = new Databaza();
	
	public List<Osoba> getOsoby() {
		return db.getOsoby();
	}
	
	public void vlozOsobu(FormularEvent event)
	{
		String meno = event.getMeno();
		String pohlavieId = event.getPohlavie();
		String statnaPrislusnost = event.getStatnaPrislusnost();
		String status = event.getStatus();
		int vekovaKategoriaId = event.getVekovaKategoria();
		String zamestnanie = event.getPoslednyZamestnavatel();
		boolean jeCudzinec = event.jeCudzinec();
		
		VekovaKategoria vekovaKategoria = null;
		
		switch(vekovaKategoriaId)
		{
			case 0:
				vekovaKategoria = VekovaKategoria.dieta;
				break;
			case 1:
				vekovaKategoria = VekovaKategoria.dospely;
				break;
			case 2:
				vekovaKategoria = VekovaKategoria.senior;
				break;
		}
		
		ZamestnaneckyStatus zamStatus;
		
		if (status.equals("zamestnany"))
		{
			zamStatus = ZamestnaneckyStatus.zamestnany;
		}
		else if (status.equals("nezamestnany"))
		{
			zamStatus = ZamestnaneckyStatus.nezamestnany;
		}
		else if (status.equals("zivnostnik"))
		{
			zamStatus = ZamestnaneckyStatus.zivnostnik;
		}
		else 
		{
			zamStatus = ZamestnaneckyStatus.iny;
			System.err.println(status);
		}
		
		Pohlavie pohlavie;
		
		if (pohlavieId.equalsIgnoreCase("muz"))
		{
			pohlavie = Pohlavie.muz;
		}
		else
		{
			pohlavie = Pohlavie.zena;
		}
		
		Osoba osoba = new Osoba(meno, zamestnanie, vekovaKategoria, zamStatus, jeCudzinec, statnaPrislusnost, pohlavie);
		db.vlozOsobu(osoba);
	}
}
