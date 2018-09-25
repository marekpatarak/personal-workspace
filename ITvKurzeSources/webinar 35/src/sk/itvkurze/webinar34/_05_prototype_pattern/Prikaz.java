package sk.itvkurze.webinar34._05_prototype_pattern;

import java.util.List;

/**
 * Implementujeme len plytku kopiu, t.j. napr. referencna premenna parametre sa skopiruje, t.j. budeme mat 
 * dve referencie s ktorymi budeme ukazovat na ten isty objekt v pamati
 * @author Administrator
 *
 */
public class Prikaz implements Cloneable
{
	private String sql;
	private List<String> parametre;
	private Zaznam zaznam;
	
	public Prikaz(String sql, List<String> parametre, Zaznam zaznam)
	{
		this.sql = sql;
		this.parametre = parametre;
		this.zaznam = zaznam;
	}
	
	public Prikaz clone()
	{
		try 
		{
			return (Prikaz) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public String getSql()
	{
		return sql;
	}

	public List<String> getParametre()
	{
		return parametre;
	}

	public Zaznam getZaznam()
	{
		return zaznam;
	}
	
	
}
