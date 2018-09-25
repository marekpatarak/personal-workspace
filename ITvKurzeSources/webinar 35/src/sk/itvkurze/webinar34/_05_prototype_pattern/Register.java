package sk.itvkurze.webinar34._05_prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class Register
{
	private Map<String, Polozka> polozky = new HashMap<>();
	
	public Register()
	{
		nacitajPolozky();
	}
	
	public Polozka vytvorPolozku(String typ)
	{
		Polozka polozka = null;
		
		try
		{
			polozka = (Polozka) (polozky.get(typ)).clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return polozka;
	}
	
	private void nacitajPolozky()
	{
		Film film = new Film();
		film.setNazov("Hitch");
		film.setCena(11.99);
		film.setDlzka("2 hodiny");
		polozky.put("Film", film);
		
		Kniha kniha = new Kniha();
		kniha.setNazov("Wicket in Action");
		kniha.setCena(15.99);
		kniha.setPocetStran(390);
		polozky.put("Kniha", kniha);
	}
}
