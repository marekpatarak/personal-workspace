package sk.itvkurze.webinar34._04_builder_pattern;

import java.io.Serializable;

/**
 * Kriteria aby trieda mohla byt tzv. Bean-a
 * 
 * 1) implementovat rozhranie Serializable
 * 2) obsahuje len bezparametricky konstruktor
 * 3) obsahuje len privatne atributy a verejne gettre a settre
 * 
 * Velka nevyhoda je, ze nevieme spravit immutable object z tejto triedy
 */
public class Osoba implements Serializable
{
	private static final long serialVersionUID = 7548449493759821918L;
	
	private int id;
	private String meno;
	private String priezvisko;
	private int vek;
	private boolean jeMuz;
	
	public Osoba()
	{
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getMeno()
	{
		return meno;
	}
	
	public void setMeno(String meno)
	{
		this.meno = meno;
	}
	
	public String getPriezvisko()
	{
		return priezvisko;
	}
	
	public void setPriezvisko(String priezvisko)
	{
		this.priezvisko = priezvisko;
	}
	
	public int getVek()
	{
		return vek;
	}
	
	public void setVek(int vek)
	{
		this.vek = vek;
	}
	
	public boolean jeMuz()
	{
		return jeMuz;
	}
	
	public void jeMuz(boolean jeMuz)
	{
		this.jeMuz = jeMuz;
	}
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
}
