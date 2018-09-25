package sk.itvkurze.webinar24._01_kruhovy_zasobnik_s_generikami;

// T moze reprezentovat cisla, retazce, osoby, bankove ucty, aky kolvek definovany typ v Jave, dokonca to moze byt rozhranie
public class KruhovyZasobnik<T>
{
	private T[] zasobnik;
	private int kurzorCitania = 0;
	private int kurzorZapisovania = 0;
	
	public KruhovyZasobnik(int velkost) 
	{
		zasobnik = (T[]) new Object[velkost];
	}

	public boolean vloz(T prvok)
	{
		if (zasobnik[kurzorZapisovania] != null)
		{
			return false;
		}
		
		zasobnik[kurzorZapisovania] = prvok;
		kurzorZapisovania = dalsi(kurzorZapisovania);
		
		return true;
	}

	public T vyber()
	{
		final T prvok = zasobnik[kurzorCitania];	// extrakcia lokalnej premennej Alt + Shift + L
		
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
