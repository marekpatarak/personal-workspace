package sk.itvkurze.webinar23.archiv;

/**
 * Jedna sa o domenovy objekt, ktory v sebe skryva rozne typy zmluv.
 */
public class Zmluva
{
	private int id;
	private final String klient;
	private final int odpracovaneHodiny;
	
	public Zmluva(final String klient, final int odpracovaneHodiny) 
	{
		this.klient = klient;
		this.odpracovaneHodiny = odpracovaneHodiny;
	}
	
	public int getId() 
	{
		return this.id;
	}
	
	public String getKlient() 
	{
		return this.klient;
	}
	
	public int getOdpracovaneHodiny() 
	{
		return this.odpracovaneHodiny;
	}

	public void setId(int nasledujuceId)
	{
		this.id = nasledujuceId;
	}
}
