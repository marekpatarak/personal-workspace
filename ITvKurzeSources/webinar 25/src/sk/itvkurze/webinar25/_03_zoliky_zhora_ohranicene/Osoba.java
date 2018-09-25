package sk.itvkurze.webinar25._03_zoliky_zhora_ohranicene;

import java.util.Objects;

public class Osoba
{
	private final String meno;
	private final int vek;
	
	public Osoba(String meno, int vek)
	{
		Objects.requireNonNull(meno);
		
		this.meno = meno;
		this.vek = vek;
	}
	
	public int getVek() {
		return this.vek;
	}
	
	public String getMeno() {
		return this.meno;
	}

	@Override
	public int hashCode()
	{
		int vysledok = meno.hashCode();
		vysledok = 31 * vysledok + vek;
		return vysledok;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null || getClass() != obj.getClass()) 
		{
			return false;
		}
		
		Osoba osoba = (Osoba) obj;
		
		return vek == osoba.getVek() && meno.equals(osoba.getMeno());
	}

	@Override
	public String toString()
	{
		return "Osoba {meno=" + meno + ", vek=" + vek + "}";
	}
	
	
}
