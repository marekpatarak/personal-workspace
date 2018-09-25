package sk.itvkurze.webinar34._03_singleton_pattern;

public class DatabazaSingletonTester
{
	public static void main(String[] args)
	{
		// 1) eager loading
		DatabazaSingletonEagerLoading dbSingleton = DatabazaSingletonEagerLoading.getInstance();
		
		System.out.println(dbSingleton);
		
		// DatabazaSingletonEagerLoading dbSingleton2 = new DatabazaSingletonEagerLoading();
		
		DatabazaSingletonEagerLoading dalsiDbSingleton = DatabazaSingletonEagerLoading.getInstance();
		
		System.out.println(dalsiDbSingleton);
		
		// 2) lazy loading
		DatabazaSingletonLazyLoading lazyLoading = DatabazaSingletonLazyLoading.getInstance();
		
		System.out.println(lazyLoading);
		
		DatabazaSingletonLazyLoading dalsiLazyLoading = DatabazaSingletonLazyLoading.getInstance();
		
		System.out.println(dalsiLazyLoading);
		
		// 3) thread safe
		DatabazaSingletonThreadSafe threadSafe = DatabazaSingletonThreadSafe.getInstance();
		
		System.out.println(threadSafe);
		
		DatabazaSingletonThreadSafe dalsiThreadSafe = DatabazaSingletonThreadSafe.getInstance();
		
		System.out.println(dalsiThreadSafe);
	}
}
