package sk.itvkurze.swing._23_MVC_datovy_model.model;

import java.util.ArrayList;
import java.util.List;

public class Databaza
{
	private List<Osoba> osoby;
	
	public Databaza()
	{
		osoby = new ArrayList<Osoba>();
	}
	
	public void vlozOsobu(Osoba osoba)
	{
		osoby.add(osoba);
	}
	
	public List<Osoba> getOsoby()
	{
		return osoby;
	}
}
