package sk.itvkurze.webinar37._10_facade_pattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCbezFacadePatternu
{
	public static void main(String[] args)
	{
		InMemoryDB singletonDB = InMemoryDB.getInstance();
		
		try {
			Connection spojenie = singletonDB.getSpojenie();
			
			Statement prikaz = spojenie.createStatement();
			prikaz.executeUpdate("CREATE TABLE Adresa (id integer, ulica varchar(20), mesto varchar(20))");
			
			System.out.println("Tabulka bola uspesne vytvorena.");
			
			prikaz.close();
			
			prikaz = spojenie.createStatement();
			int pocet = prikaz.executeUpdate("insert into Adresa (id, ulica, mesto) values (1, 'Horna 4', 'Michalovce')");
			System.out.println(pocet + " zaznamov bolo vlozenych");
			prikaz.close();
			
			prikaz = spojenie.createStatement();
			ResultSet vysledky = prikaz.executeQuery("select * from Adresa");
			
			prikaz.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
