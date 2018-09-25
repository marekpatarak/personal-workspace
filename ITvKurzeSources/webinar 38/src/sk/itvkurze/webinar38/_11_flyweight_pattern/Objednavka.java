package sk.itvkurze.webinar38._11_flyweight_pattern;

public class Objednavka
{
	private final int id;
	private final PolozkaObjednavky polozka;
	
	Objednavka(int id, PolozkaObjednavky polozka)
	{
		this.id = id;
		this.polozka = polozka;
	}
	
	void spracujObjednavku()
	{
		System.out.println("Objednavam " + polozka + " - id: " + id);
	}
}
