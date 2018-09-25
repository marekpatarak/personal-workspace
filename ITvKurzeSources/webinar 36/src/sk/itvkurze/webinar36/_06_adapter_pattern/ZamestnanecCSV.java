package sk.itvkurze.webinar36._06_adapter_pattern;

import java.util.StringTokenizer;

public class ZamestnanecCSV
{
	private String ID;
	private String meno;
	private String priezvisko;
	private String kontakt;
	
	public ZamestnanecCSV(String data)
	{
		StringTokenizer tokenizer = new StringTokenizer(data, ",");
		if (tokenizer.hasMoreElements()) 
		{
			ID = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements())
		{
			meno = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements())
		{
			priezvisko = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements())
		{
			kontakt = tokenizer.nextToken();
		}
	}

	public String getID()
	{
		return ID;
	}

	public String getMeno()
	{
		return meno;
	}

	public String getPriezvisko()
	{
		return priezvisko;
	}

	public String getKontakt()
	{
		return kontakt;
	}
}
