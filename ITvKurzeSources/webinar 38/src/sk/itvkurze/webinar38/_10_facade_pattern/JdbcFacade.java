package sk.itvkurze.webinar38._10_facade_pattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade
{
	DatabazaSingletonThreadSafe instancia;
	
	public JdbcFacade()
	{
		instancia = DatabazaSingletonThreadSafe.getInstance();
	}
	
	public int vytvorTabulku()
	{
		int pocet = 0;
		
		try 
		{
			Connection spojenie = instancia.getConnection();
			Statement prikaz = spojenie.createStatement();
			pocet = prikaz.executeUpdate("CREATE TABLE Adresa (id integer, ulica varchar(20), mesto varchar(20))");
			
			System.out.println("Tabulka bola uspesne vytvorena.");
			
			prikaz.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return pocet;
	}
	
	public int vlozDataDoTabulky() 
	{
		int pocet = 0;
		
		try
		{
			Connection spojenie = instancia.getConnection();
			Statement prikaz = spojenie.createStatement();
			pocet = prikaz.executeUpdate("INSERT INTO Adresa (id, ulica, mesto) values "
					+ "(1, 'Horna 4', 'Michalovce')");
			prikaz.close();
			spojenie.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return pocet;
	}
	
	public List<Adresa> getAdresy()
	{
		List<Adresa> adresy = new ArrayList<>();
		try 
		{
			Connection spojenie = instancia.getConnection();
			Statement prikaz = spojenie.createStatement();
			ResultSet vysledky = prikaz.executeQuery("SELECT * FROM Adresa");
			
			while (vysledky.next())
			{
				// System.out.println(vysledky.getInt(1) + " " + vysledky.getString(2) + " " + vysledky.getString(3));
				
				Adresa adresa = new Adresa();
				adresa.setId(vysledky.getInt(1));
				adresa.setUlica(vysledky.getString(2));
				adresa.setMesto(vysledky.getString(3));
				
				adresy.add(adresa);
			}
			
			vysledky.close();
			prikaz.close();
			spojenie.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return adresy;
	}
}

class Adresa
{
	private int id;
	private String ulica;
	private String mesto;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUlica()
	{
		return ulica;
	}
	public void setUlica(String ulica)
	{
		this.ulica = ulica;
	}
	public String getMesto()
	{
		return mesto;
	}
	public void setMesto(String mesto)
	{
		this.mesto = mesto;
	}
	
}
