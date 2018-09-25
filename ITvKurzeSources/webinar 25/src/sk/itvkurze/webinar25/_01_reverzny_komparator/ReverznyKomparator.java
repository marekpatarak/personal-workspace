package sk.itvkurze.webinar25._01_reverzny_komparator;

import java.util.Comparator;

public class ReverznyKomparator<T> implements Comparator<T>
{
	private final Comparator<T> delegovanyKomparator;
	
	public ReverznyKomparator(Comparator<T> komparator) 
	{
		this.delegovanyKomparator = komparator;
	}
	
	@Override
	public int compare(T o1, T o2)
	{
		return -1 * delegovanyKomparator.compare(o1, o2);
	}

}
