package sk.itvkurze.webinar38._11_flyweight_pattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SystemInventarizacie
{
	private final Katalog katalog = new Katalog();
	private final List<Objednavka> objednavky = new CopyOnWriteArrayList<>();
	
	void prijmiObjednavku(String nazovPolozky, int cisloObjednavky)
	{
		PolozkaObjednavky polozka = katalog.vyhladajPodlaNazvu(nazovPolozky);
		Objednavka objednavka = new Objednavka(cisloObjednavky, polozka);
		objednavky.add(objednavka);
	}
	
	void spracujObjednavky()
	{
		for (Objednavka objednavka : objednavky)
		{
			objednavka.spracujObjednavku();
			objednavky.remove(objednavka);
		}
	}
	
	String vytvorReport()
	{
		return "\nCelkovy pocet spracovanych objednavok: " + katalog.celkovyPocetPoloziek();
	}
}
