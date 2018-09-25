package sk.itvkurze.webinar36._06_adapter_pattern;

public class ZamestnanecLdap
{
	private String zamID;
	private String meno;
	private String priezvisko;
	private String mail;
	
	public ZamestnanecLdap(String zamID, String meno, String priezvisko, String mail)
	{
		this.zamID = zamID;
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.mail = mail;
	}

	public String getZamID()
	{
		return zamID;
	}

	public String getMeno()
	{
		return meno;
	}

	public String getPriezvisko()
	{
		return priezvisko;
	}

	public String getMail()
	{
		return mail;
	}

	@Override
	public String toString()
	{
		return "ZamestnanecLdap [zamID=" + zamID + ", nazov=" + meno + ", priezvisko=" + priezvisko + ", mail=" + mail
				+ "]";
	}
	
	
}
