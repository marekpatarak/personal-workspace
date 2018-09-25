package sk.itvkurze.webinar36._07_bridge_pattern;

public class Film
{
	private String zaner;
	private String nazov;
	private String trvanie;
	private String rok;
	
	public void setZaner(String zaner)
	{
		this.zaner = zaner;
	}

	public void setNazov(String nazov)
	{
		this.nazov = nazov;
	}

	public void setTrvanie(String trvanie)
	{
		this.trvanie = trvanie;
	}

	public void setRok(String rok)
	{
		this.rok = rok;
	}

	public String getNazov()
	{
		return this.nazov;
	}

	public String getZaner()
	{
		return zaner;
	}

	public String getTrvanie()
	{
		return trvanie;
	}

	public String getRok()
	{
		return rok;
	}
	
	

}
