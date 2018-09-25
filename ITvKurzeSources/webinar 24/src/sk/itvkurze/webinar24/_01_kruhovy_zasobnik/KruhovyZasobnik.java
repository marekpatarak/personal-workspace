package sk.itvkurze.webinar24._01_kruhovy_zasobnik;

public class KruhovyZasobnik
{
	private Object[] zasobnik;
	private int kurzorCitania = 0;			// index v poli
	private int kurzorZapisovania = 0;		// index v poli
	
	public KruhovyZasobnik(int velkost) 
	{
		zasobnik = new Object[velkost];
	}

	public boolean vloz(Object prvok)
	{
		if (zasobnik[kurzorZapisovania] != null)
		{
			return false;
		}
		
		zasobnik[kurzorZapisovania] = prvok;
		kurzorZapisovania = dalsi(kurzorZapisovania);
		
		return true;
	}

	public Object vyber()
	{
		final Object prvok = zasobnik[kurzorCitania];	// extrakcia lokalnej premennej Alt + Shift + L
		
		if (prvok != null)
		{
			zasobnik[kurzorCitania] = null;
			kurzorCitania = dalsi(kurzorCitania);
		}
		return prvok;
	}
	
	private int dalsi(int index) 
	{
		return (index + 1) % zasobnik.length;	
	}
}
