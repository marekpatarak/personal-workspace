package sk.itvkurze.webinar38._11_flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Trieda katalog vystupuje ako factory a sucasne cache pre objekty flyweights
 * (PolozkaObjednavky).
 */
public class Katalog
{
	private Map<String, PolozkaObjednavky> polozky = new HashMap<>();

	/**
	 * Vyhlada podla nazvu a vrati polozku z katalogu, v pripade, ak sa polozka v
	 * katalogu nenachadza, polozku prv vlozi do katalogu
	 * 
	 * @param nazovPolozky
	 * @return polozku objednavky z katalogu
	 */
	public PolozkaObjednavky vyhladajPodlaNazvu(String nazovPolozky)
	{
		if (!polozky.containsKey(nazovPolozky))
		{
			polozky.put(nazovPolozky, new PolozkaObjednavky(nazovPolozky));
		}
		return polozky.get(nazovPolozky);
	}

	public int celkovyPocetPoloziek()
	{
		return polozky.size();
	}
}
