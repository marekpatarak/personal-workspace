package sk.itvkurze.webinar25._04_erasure;

import java.util.List;

public class Pretazenie
{
	public void zobraz(String parameter)
	{
		
	}
	
	public void zobraz(Integer parameter)
	{
		
	}
	
	// po kompilacii bude parameter List, ktory bude prijimat java.lang.object
	// a preto by interpretere nevedel ktoru metodu ma zavolat
	public void zobraz(List<String> parameter)
	{
		
	}
	
//	public void zobraz(List<Integer> parameter)
//	{
//		
//	}
	
//	public void zobraz(List<List<String>> paramter)
//	{
//		
//	}
}
