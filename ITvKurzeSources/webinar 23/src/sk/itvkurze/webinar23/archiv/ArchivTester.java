package sk.itvkurze.webinar23.archiv;

import java.util.Scanner;

public class ArchivTester
{
	public static void main(String[] args)
	{
		VylepsenyArchivZmluv archiv = null;
		
		Kriterium kriterium = new Kriterium()
				.odpracovaneHodiny(80)
				.klient("Slsp");
		
		Iterable<Zmluva> zmluvy = archiv.vyhladaj(kriterium);
	}
}
