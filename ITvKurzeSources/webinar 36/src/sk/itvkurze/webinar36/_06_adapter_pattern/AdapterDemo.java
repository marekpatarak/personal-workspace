package sk.itvkurze.webinar36._06_adapter_pattern;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo
{

	public static void main(String[] args)
	{
		Integer[] cisla = new Integer[] { 22, 23, 24 };
		
		List<Integer> cislaAkoList = Arrays.asList(cisla);
		
		System.out.println(cisla);
		
		System.out.println(cislaAkoList);
	}

}
