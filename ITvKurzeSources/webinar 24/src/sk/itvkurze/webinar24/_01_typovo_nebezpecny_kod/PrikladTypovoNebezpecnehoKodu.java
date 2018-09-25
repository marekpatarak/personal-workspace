package sk.itvkurze.webinar24._01_typovo_nebezpecny_kod;

import sk.itvkurze.webinar24._01_kruhovy_zasobnik.KruhovyZasobnik;

public class PrikladTypovoNebezpecnehoKodu
{
	private static final String NOVY_RIADOK = "\n";
	
	public static void main(String[] args)
	{
		KruhovyZasobnik zasobnik = new KruhovyZasobnik(10);
		
		zasobnik.vloz("Igor Kovac");
		zasobnik.vloz("Emil Horvath");
		zasobnik.vloz("Iveta Satarova");
		
		zasobnik.vloz(1);
		
		String retazec = zasobnikAkoRetazec(zasobnik);
		System.out.println(retazec);
	}

	private static String zasobnikAkoRetazec(KruhovyZasobnik zasobnik)
	{
		StringBuilder builder = new StringBuilder();
		
		String prvok;
		while ((prvok = (String) zasobnik.vyber()) != null)
		{
			builder.append(prvok);
			builder.append(NOVY_RIADOK);
		}
		return builder.toString();
	}
	
	
}
