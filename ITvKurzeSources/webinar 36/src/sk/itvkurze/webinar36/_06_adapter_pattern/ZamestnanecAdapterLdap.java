package sk.itvkurze.webinar36._06_adapter_pattern;

public class ZamestnanecAdapterLdap implements Zamestnanec
{
	private ZamestnanecLdap instance;
	
	
	public ZamestnanecAdapterLdap(ZamestnanecLdap instance)
	{
		this.instance = instance;
	}

	@Override
	public String getId()
	{
		return instance.getZamID();
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
		return instance.getMail();
	}

	@Override
	public String toString()
	{
		return "ZamestnanecAdapterLdap [instance=" + instance + "]";
	}

	
}
