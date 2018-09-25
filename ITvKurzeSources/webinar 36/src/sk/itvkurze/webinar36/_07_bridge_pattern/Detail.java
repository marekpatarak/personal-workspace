package sk.itvkurze.webinar36._07_bridge_pattern;

public class Detail
{
	private String navestie;
	private String hodnota;
	
	public Detail(String navestie, String hodnota)
	{
		this.navestie = navestie;
		this.hodnota = hodnota;
	}

	public String getNavestie()
	{
		return navestie;
	}

	public String getHodnota()
	{
		return hodnota;
	}
	
	
}
