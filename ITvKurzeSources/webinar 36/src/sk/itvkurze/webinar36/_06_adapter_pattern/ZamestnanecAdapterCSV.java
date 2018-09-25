package sk.itvkurze.webinar36._06_adapter_pattern;

public class ZamestnanecAdapterCSV implements Zamestnanec
{
	private ZamestnanecCSV instance;
	
	
	public ZamestnanecAdapterCSV(ZamestnanecCSV instance)
	{
		this.instance = instance;
	}

	@Override
	public String getId()
	{
		return instance.getID();
	}

	@Override
	public String getKrstneMeno()
	{
		return instance.getMeno();
	}

	@Override
	public String getPriezvisko()
	{
		return instance.getPriezvisko();
	}

	@Override
	public String getEmail()
	{
		return instance.getKontakt();
	}

	@Override
	public String toString()
	{
		return "ZamestnanecAdapterCSV [id = " + instance.getID() + ", nazov = " + instance.getMeno() + 
				", priezvisko = " + instance.getPriezvisko() + ", email = " + instance.getKontakt() + "]";
	}

	
}
