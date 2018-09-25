package sk.itvkurze.webinar25._03_zoliky_neohranicene;

import java.util.ArrayList;
import java.util.List;

public class NeohranicenyZolik
{
	public static void main(String[] args)
	{
		List<? super Object> objekty = new ArrayList<>();
		objekty.add(new Object());
		objekty.add(new Osoba("Peter Kovac", 33));
		
		System.out.println(objekty);
		
		List<?> objekty3 = new ArrayList<>();
		objekty3.add(null);		// jediny objekt, ktory tu mozeme vlozit
		// lebo je to jediny typ, ktory je nam znamy uz pocas kompilacie
		
		System.out.println(objekty3);
	}
}
