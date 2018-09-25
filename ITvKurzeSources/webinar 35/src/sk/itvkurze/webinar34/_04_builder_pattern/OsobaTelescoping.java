package sk.itvkurze.webinar34._04_builder_pattern;

import java.io.Serializable;

/**
 * Podarilo sa nam vytvorit immutable object.
 * Avsak ak by sme chceli nastavit povedzme len id a vek osoby,
 * museli by sme pouzit konstruktor so 4 parametrami a zvysne
 * atributy by nadobudli pociatocne hodnoty, niekedy null a pod
 * co nie je v praxi az tak ziaduce.

 * @author Administrator
 *
 */
public class OsobaTelescoping implements Serializable
{
	private static final long serialVersionUID = 7548449493759821918L;
	
	private int id;
	private String meno;
	private String priezvisko;
	private int vek;
	private boolean jeMuz;
	
	public OsobaTelescoping(int id)
	{
		this.id = id;
	}
	
	public OsobaTelescoping(int id, String meno)
	{
		this(id);
		this.meno = meno;
	}

	public OsobaTelescoping(int id, String meno, String priezvisko)
	{
		this(id, meno);
		this.priezvisko = priezvisko;
	}

	public OsobaTelescoping(int id, String meno, String priezvisko, int vek)
	{
		this(id, meno, priezvisko);
		this.vek = vek;
	}

	public OsobaTelescoping(int id, String meno, String priezvisko, int vek, boolean jeMuz)
	{
		this(id, meno, priezvisko, vek);
		this.jeMuz = jeMuz;
	}

	public int getId()
	{
		return id;
	}
	
	public String getMeno()
	{
		return meno;
	}
	
	public String getPriezvisko()
	{
		return priezvisko;
	}
	
	public int getVek()
	{
		return vek;
	}
	
	public boolean jeMuz()
	{
		return jeMuz;
	}
	
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
}
