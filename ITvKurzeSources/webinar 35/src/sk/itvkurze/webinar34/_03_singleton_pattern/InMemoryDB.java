package sk.itvkurze.webinar34._03_singleton_pattern;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class InMemoryDB
{
	private static InMemoryDB instance = null;
	
	private Connection spojenie = null;
	
	private InMemoryDB() 
	{
		try
		{
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static InMemoryDB getInstance()
	{
		if(instance == null)
		{
			synchronized(InMemoryDB.class)
			{
				if(instance == null)
				{
					instance = new InMemoryDB();
				}
			}
		}
		return instance;
	}
	
	public Connection getSpojenie()
	{
		if(spojenie == null)
		{
			synchronized(InMemoryDB.class)
			{
				if(spojenie == null)
				{
					try
					{
						String spojenieUrl = "jdbc:derby:memory:itvkurze/testdb;create=true";
						
						spojenie = DriverManager.getConnection(spojenieUrl);
					} 
					catch(SQLException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
		return spojenie;
	}
}
