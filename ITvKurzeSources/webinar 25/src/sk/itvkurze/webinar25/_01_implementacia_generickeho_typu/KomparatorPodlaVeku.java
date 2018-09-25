package sk.itvkurze.webinar25._01_implementacia_generickeho_typu;

import java.util.Comparator;

// implementujeme genericke rozhranie
public class KomparatorPodlaVeku implements Comparator<Osoba>
{

	@Override
	public int compare(Osoba osoba1, Osoba osoba2)
	{
		// return Integer.compare(osoba1.getVek(), osoba2.getVek());
		// reverzny komparator, od najstarsej osoby
		return Integer.compare(osoba1.getVek(), osoba2.getVek());
	}
 
}
