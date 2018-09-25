package sk.itvkurze.webinar23.archiv;

public class Kriterium
{
	private String klient;
	private int minOdpracovaneHodiny;
	
	public String getKlient()
	{
		return klient;
	}
	
	public Kriterium klient(String klient)
	{
		this.klient = klient;
		return this;
	}
	
	public int getMinOdpracovaneHodiny()
	{
		return minOdpracovaneHodiny;
	}
	
	public Kriterium odpracovaneHodiny(int minOdpracovaneHodiny)
	{
		this.minOdpracovaneHodiny = minOdpracovaneHodiny;
		return this;
	}
}
