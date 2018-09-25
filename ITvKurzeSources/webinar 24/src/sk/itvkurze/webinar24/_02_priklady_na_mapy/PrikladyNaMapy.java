package sk.itvkurze.webinar24._02_priklady_na_mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sk.itvkurze.webinar24._02_problemy_s_poliami.Osoba;

public class PrikladyNaMapy
{
	public static void main(String[] args)
	{
		Osoba peter_kovac = new Osoba("Peter Kovac", 33);
		Osoba miro_ivanov = new Osoba("Miroslav Ivanov", 21);
		Osoba emil_horvath = new Osoba("Emil Horvath", 40);
		
		// od jdk 7, to mozeme zapisat kratsie new HashMap<>()
		Map<String, Osoba> osoby = new HashMap<String, Osoba>();
		osoby.put(peter_kovac.getMeno(), peter_kovac);
		osoby.put(miro_ivanov.getMeno(), miro_ivanov);
		osoby.put(emil_horvath.getMeno(), emil_horvath);
		
		// osoby.put(peter_kovac.getMeno(), emil_horvath);			// prepiseme uz existujuci zaznam
		
		System.out.println(osoby);
		
		// mozeme vybrat z mapy hodnotu podla kluca
		System.out.println(osoby.get("Peter Kovac"));
		
		// mame tri moznosti ako iterovat cez mapu
		// 1) cez kluce
		System.out.println("... prechadzanie mapy pomocou klucov ...");
		for (String meno : osoby.keySet()) 
		{
			System.out.println("Meno: " + meno);
		}
		
		// 2) pomocou hodnout
		System.out.println("... prechadzanie mapy pomocou hodnot ...");
		for (Osoba osoba : osoby.values())
		{
			System.out.println("Osoba: " + osoba);
		}
		
		// 3) niekedy potrebujete pocas iteracie mat pristup ku klucom a sucasne aj hdonotam - tzv. entry set
		System.out.println("... prechadzanie mapy pomocou metody entrySet() ...");
		for (Entry<String, Osoba> zaznam : osoby.entrySet()) {
			System.out.println("Meno: " + zaznam.getKey());
			System.out.println("Osoba: " + zaznam.getValue());
		}
	}
}
