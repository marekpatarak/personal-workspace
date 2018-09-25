package sk.itvkurze.webinar23.archiv;

public interface VylepsenyArchivZmluv extends AutoCloseable
{
	int NO_ID = 0;
	
	void vloz(Zmluva zmluva) throws ArchivException;
	
	void zmaz(Zmluva zmluva) throws ArchivException;
	
	Iterable<Zmluva> vyhladaj(final Kriterium kriterium) throws ArchivException;
}
