package sk.itvkurze.webinar34._05_prototype_pattern;

public abstract class Polozka implements Cloneable
{
	private String nazov;
	private double cena;
	private String url;
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public String getNazov()
	{
		return nazov;
	}
	
	public void setNazov(String nazov)
	{
		this.nazov = nazov;
	}
	
	public double getCena()
	{
		return cena;
	}
	
	public void setCena(double cena)
	{
		this.cena = cena;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
}
