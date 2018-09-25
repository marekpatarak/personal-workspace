package sk.itvkurze.webinar34._03_singleton_pattern;

public class DatabazaSingletonEagerLoading
{
	// eager loading - instanciu mame dostupnu hned po loadnuti triedy class loaderom
	private static DatabazaSingletonEagerLoading instance = new DatabazaSingletonEagerLoading();
	
	private DatabazaSingletonEagerLoading() 
	{
		
	}
	
	public static DatabazaSingletonEagerLoading getInstance() 
	{
		return instance;
	}
}
