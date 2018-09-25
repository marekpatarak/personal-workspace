package sk.itvkurze.webinar37._10_facade_pattern;

public class DatabazaSingletonThreadSafe
{
	private static DatabazaSingletonThreadSafe instance;
	
	private DatabazaSingletonThreadSafe() 
	{
		
	}
	
	public static DatabazaSingletonThreadSafe getInstance()
	{
		if(instance == null)
		{
			synchronized(DatabazaSingletonThreadSafe.class)
			{
				if(instance == null)
				{
					instance = new DatabazaSingletonThreadSafe();
				}
			}
		}
		
		return instance;
	}
}
