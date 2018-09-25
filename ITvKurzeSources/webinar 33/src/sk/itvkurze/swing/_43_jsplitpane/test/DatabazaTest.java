package sk.itvkurze.swing._43_jsplitpane.test;

import java.sql.SQLException;

import sk.itvkurze.swing._43_jsplitpane.model.Databaza;
import sk.itvkurze.swing._43_jsplitpane.model.Osoba;
import sk.itvkurze.swing._43_jsplitpane.model.Pohlavie;
import sk.itvkurze.swing._43_jsplitpane.model.VekovaKategoria;
import sk.itvkurze.swing._43_jsplitpane.model.ZamestnaneckyStatus;

public class DatabazaTest
{
	public static void main(String[] args)
	{
		Databaza db = new Databaza();
		try
		{
			db.vytvorSpojenie();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		db.vlozOsobu(new Osoba("Michal Kasan", "Prima Banka", VekovaKategoria.dospely, ZamestnaneckyStatus.zamestnany, false, "SR", Pohlavie.muz));
		db.vlozOsobu(new Osoba("Eva Pokorna", "VUB Banka", VekovaKategoria.senior, ZamestnaneckyStatus.zivnostnik, true, "GER", Pohlavie.zena));
		
		try
		{
			db.uloz();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			db.nacitajCeluDB();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		db.zrusSpojenie();
	}
}
