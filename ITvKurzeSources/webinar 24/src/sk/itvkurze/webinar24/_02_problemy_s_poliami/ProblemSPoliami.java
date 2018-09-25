package sk.itvkurze.webinar24._02_problemy_s_poliami;

import java.util.Arrays;

public class ProblemSPoliami
{
	public static void main(String[] args)
	{
		Osoba peter_kovac = new Osoba("Peter Kovac", 33);
		Osoba miro_ivanov = new Osoba("Miroslav Ivanov", 21);
		
		Osoba[] osoby = { peter_kovac, miro_ivanov };
		// 1. problem - pole neimplementuje toString metodu pre jeho prvky
		System.out.println(osoby);
		System.out.println(Arrays.toString(osoby));
		
		// 2. problem - automaticke rozsirovanie kapacity pola
		Osoba igor_novak = new Osoba("Igor Novak", 27);
		// osoby[2] = igor_novak;
		// System.out.println(Arrays.toString(osoby));
		
		osoby = vloz(igor_novak, osoby);	// problem fixneme vytovrenim pomocnej metody
		System.out.println(Arrays.toString(osoby));
		
		// 3. problem - chceme zistit ci sa dany provk nachadza v poli
		Osoba hladanaOsoba = new Osoba("Eva Novakova", 20);
		boolean obsahuje = obsahuje(hladanaOsoba, osoby);
		System.out.println("Hladana osoba: " + hladanaOsoba + (obsahuje ? " sa nasla" : " sa nenasla"));
		
		obsahuje = obsahuje(igor_novak, osoby);
		System.out.println("Hladana osoba: " + igor_novak + (obsahuje ? " sa nasla" : " sa nenasla"));
		
		System.out.println(Arrays.toString(osoby));
	}

	private static boolean obsahuje(Osoba hladanaOsoba, Osoba[] osoby)
	{
		for(Osoba osoba : osoby) 
		{
			if(osoba.equals(hladanaOsoba)) 
			{
				return true;
			}
		}
		return false;
		
	}

	private static Osoba[] vloz(Osoba osoba, Osoba[] osoby)
	{
		final int velkost = osoby.length;
		osoby = Arrays.copyOf(osoby, velkost + 1);
		osoby[velkost] = osoba;
		return osoby;
	}
}
