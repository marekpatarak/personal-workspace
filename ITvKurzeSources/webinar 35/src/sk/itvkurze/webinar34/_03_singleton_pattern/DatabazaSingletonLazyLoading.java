package sk.itvkurze.webinar34._03_singleton_pattern;

public class DatabazaSingletonLazyLoading
{
	// lazy loading - instancia sa spristupni az na poziadanie (on demand)
	// dovod pouzitia cas spustenia aplikacie nam narasta - preto zdroje loadneme az ked nam ich skutocne treba
	// inymi slovami povedane - lazy loading nam zlepsuje vykonnost nasej aplikacie
	private static DatabazaSingletonLazyLoading instance = null;
	
	private DatabazaSingletonLazyLoading() 
	{
		
	}
	
	public static DatabazaSingletonLazyLoading getInstance() 
	{
		if (instance == null)
		{
			instance = new DatabazaSingletonLazyLoading();
		}
		return instance;
	}
}
