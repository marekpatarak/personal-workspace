package sk.itvkurze.webinar24._01_kruhovy_zasobnik_retazec;

public class KruhovyZasobnikStudent
{
	private String[] zasobnik;
	private int kurzorCitania = 0;
	private int kurzorZapisovania = 0;
	
	public KruhovyZasobnikStudent(int velkost) 
	{
		zasobnik = new String[velkost];
	}

	public boolean vloz(String prvok)
	{
		if (zasobnik[kurzorZapisovania] != null)
		{
			return false;
		}
		
		zasobnik[kurzorZapisovania] = prvok;
		kurzorZapisovania = dalsi(kurzorZapisovania);
		
		return true;
	}

	public String vyber()
	{
		final String prvok = zasobnik[kurzorCitania];	// extrakcia lokalnej premennej Alt + Shift + L
		
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
