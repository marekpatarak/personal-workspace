package sk.itvkurze.webinar24._02_priklady_na_mnoziny;

import java.util.HashSet;
import java.util.Set;

import sk.itvkurze.webinar24._02_problemy_s_poliami.Osoba;

public class PrikladyNaMnoziny
{
	public static void main(String[] args)
	{
		Osoba peter_kovac = new Osoba("Peter Kovac", 33);
		Osoba miro_ivanov = new Osoba("Miroslav Ivanov", 21);
		Osoba emil_horvath = new Osoba("Emil Horvath", 40);
		
		// List<Osoba> osoby = new ArrayList<>();
		Set<Osoba> osoby = new HashSet<>();
		
		osoby.add(peter_kovac);
		osoby.add(miro_ivanov);
		osoby.add(emil_horvath);
		
		// vlozime duplicitu
		osoby.add(peter_kovac);
		
		// vidime, ze dokazeme iterovat cez zoznamy a mapy uplne identickym sposobom
		for(Osoba osoba : osoby)
		{
			System.out.println(osoba);
		}
		
		// avsak mnoziny nezachovavaju poradie prvkov v akom boli vlozene
		// System.out.println(osoby.get(0));     // nemaju metodu get() na ziskanie prvku podla indexu
		
		// rovnako ako v zoznamoch aj v mnozinach dokazeme testovat, ci obsahuje nejaky prvok
		System.out.println(osoby.contains(peter_kovac));
		System.out.println(osoby.contains(new Osoba("Peter Pan", 39)));
	}
}
