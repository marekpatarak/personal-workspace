package sk.itvkurze.webinar34._03_singleton_pattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InMemoryDBTester
{
	public static void main(String[] args)
	{
		long casPred = 0;
		long casPo = 0;
		
		InMemoryDB instance = InMemoryDB.getInstance();
		
		casPred = System.currentTimeMillis();
		Connection spojenie = instance.getSpojenie();
		casPo = System.currentTimeMillis();
		
		System.out.println((casPo - casPred) + " milisekund");
		
		Statement prikaz;
		
		try 
		{
			prikaz = spojenie.createStatement();
			prikaz.executeUpdate("CREATE TABLE Adresa (id int, ulica varchar(20), mesto varchar(20))");
			System.out.println("Tabulka bola vytvorena");
			prikaz.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		casPred = System.nanoTime();
		spojenie = instance.getSpojenie();
		casPo = System.nanoTime();
		
		System.out.println((casPo - casPred)/1000000.0 + " milisekund");
	}
}
