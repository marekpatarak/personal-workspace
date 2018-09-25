package sk.itvkurze.webinar38._11_flyweight_pattern;

/**
 * Instancie tejto triedy budu predstavovat samotne flyweight objekty.
 */
public class PolozkaObjednavky
{
	private final String nazov;
	
	public PolozkaObjednavky(String nazov)
	{
		this.nazov = nazov;
	}
	
	public String toString()
	{
		return this.nazov;
	}
}
