package sk.itvkurze.swing._35_spojenie_s_databazou.test;

import sk.itvkurze.swing._35_spojenie_s_databazou.model.Databaza;

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
		
		db.zrusSpojenie();
	}
}
