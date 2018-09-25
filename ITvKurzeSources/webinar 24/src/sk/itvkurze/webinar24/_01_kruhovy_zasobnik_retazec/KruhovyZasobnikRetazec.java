package sk.itvkurze.webinar24._01_kruhovy_zasobnik_retazec;

public class KruhovyZasobnikRetazec
{
	private Student[] zasobnik;
	private int kurzorCitania = 0;
	private int kurzorZapisovania = 0;
	
	public KruhovyZasobnikRetazec(int velkost) 
	{
		zasobnik = new Student[velkost];
	}

	public boolean vloz(Student prvok)
	{
		if (zasobnik[kurzorZapisovania] != null)
		{
			return false;
		}
		
		zasobnik[kurzorZapisovania] = prvok;
		kurzorZapisovania = dalsi(kurzorZapisovania);
		
		return true;
	}

	public Student vyber()
	{
		final Student prvok = zasobnik[kurzorCitania];	// extrakcia lokalnej premennej Alt + Shift + L
		
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
