package sk.itvkurze.webinar34._05_prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class PrikazDemo
{
	public static void main(String[] args)
	{
		String sql = "select * from filmy where nazov = ?";
		
		List<String> parametre = new ArrayList<>();
		parametre.add("Hitch");
		Zaznam zaznam = new Zaznam();
		
		Prikaz prvyPrikaz = new Prikaz(sql, parametre, zaznam);
		System.out.println(prvyPrikaz.getSql());
		System.out.println(prvyPrikaz.getParametre());
		System.out.println(prvyPrikaz.getZaznam());
		
		Prikaz druhyPrikaz = prvyPrikaz.clone();
		System.out.println(druhyPrikaz.getSql());
		System.out.println(druhyPrikaz.getParametre());
		System.out.println(druhyPrikaz.getZaznam());
	}
}
