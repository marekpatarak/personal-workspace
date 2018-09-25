package sk.itvkurze.webinar36._07_bridge_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeJDBCDemo
{
	public static void main(String[] args)
	{
		try 
		{
			// JDBC ako API :-)
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()); // <- Ovladac
			
			String url = "jdbc:derby:memory:itvkurze/testDB;create=true";
			
			Connection spojenie = DriverManager.getConnection(url);
			
			Statement prikaz = spojenie.createStatement();
			
			// Tento klient zastresuje abstrakciu a dokaze pracovat s akokoukolvek databazou, pre ktoru mame driver
			prikaz.executeUpdate("CREATE TABLE Adresa (id INT, ulica VARCHAR(20), mesto VARCHAR(20))");
			
			System.out.println("Tabulka bola uspesne vytvorena");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
