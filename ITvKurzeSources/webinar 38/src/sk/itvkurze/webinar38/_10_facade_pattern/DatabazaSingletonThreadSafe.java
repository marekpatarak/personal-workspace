package sk.itvkurze.webinar38._10_facade_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabazaSingletonThreadSafe {

	private static volatile DatabazaSingletonThreadSafe instance = null;
	
	private Connection conn = null;
	
	private DatabazaSingletonThreadSafe () {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DatabazaSingletonThreadSafe getInstance() {
		if(instance == null) {
			synchronized(DatabazaSingletonThreadSafe.class) {
				if (instance == null) {
					instance = new DatabazaSingletonThreadSafe();
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		if(conn == null || conn.isClosed()) {
			synchronized (DatabazaSingletonThreadSafe.class) {
				if(conn == null || conn.isClosed()) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
}
