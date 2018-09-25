package sk.itvkurze.webinar36._06_adapter_pattern;

public class ZamestnanecDB implements Zamestnanec
{
	private String id;
	private String krstneMeno;
	private String priezvisko;
	private String email;
	
	public ZamestnanecDB(String id, String krstneMeno, String priezvisko, String email)
	{
		this.id = id;
		this.krstneMeno = krstneMeno;
		this.priezvisko = priezvisko;
		this.email = email;
	}

	@Override
	public String getId()
	{
		return id;
	}

	@Override
	public String getKrstneMeno()
	{
		return krstneMeno;
	}

	@Override
	public String getPriezvisko()
	{
		return priezvisko;
	}

	@Override
	public String getEmail()
	{
		return email;
	}

	@Override
	public String toString()
	{
		return "ZamestnanecDB [id=" + id + ", krstneMeno=" + krstneMeno + ", priezvisko=" + priezvisko + ", email="
				+ email + "]";
	}
}
