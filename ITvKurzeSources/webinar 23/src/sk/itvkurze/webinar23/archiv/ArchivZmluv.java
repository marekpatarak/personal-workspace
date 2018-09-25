package sk.itvkurze.webinar23.archiv;

public interface ArchivZmluv
{
	int NEEXISTUJUCE_ID = 0;
	
	void uloz(Zmluva zmluva);
	
	void zmaz(Zmluva zmluva);
	
	Iterable<Zmluva> najdiZmluvyPodlaKlienta(final String klient);
	
	Iterable<Zmluva> najdiZmluvyPodlaOdpraovanychHodin(final int odpracovaneHodiny);
}
