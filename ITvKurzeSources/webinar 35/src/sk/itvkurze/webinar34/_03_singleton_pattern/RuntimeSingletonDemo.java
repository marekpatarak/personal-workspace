package sk.itvkurze.webinar34._03_singleton_pattern;

public class RuntimeSingletonDemo
{
	public static void main(String[] args)
	{
		Runtime singletonRuntime = Runtime.getRuntime();
		
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime dalsiRuntime = Runtime.getRuntime();
		
		System.out.println(dalsiRuntime);
		
		if(singletonRuntime == dalsiRuntime) 
		{
			System.out.println("Jedna sa o rovnaku instanciu");
		}
	}
}
