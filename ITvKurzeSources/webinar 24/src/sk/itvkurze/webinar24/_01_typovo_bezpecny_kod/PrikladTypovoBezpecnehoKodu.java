package sk.itvkurze.webinar24._01_typovo_bezpecny_kod;

import sk.itvkurze.webinar24._01_kruhovy_zasobnik_s_generikami.KruhovyZasobnik;

public class PrikladTypovoBezpecnehoKodu
{
	private static final String NOVY_RIADOK = "\n";
	
	public static void main(String[] args)
	{
		KruhovyZasobnik<String> zasobnik = new KruhovyZasobnik<String>(10);
		
		zasobnik.vloz("Igor Kovac");
		zasobnik.vloz("Emil Horvath");
		zasobnik.vloz("Iveta Satarova");
		
		String retazec = zasobnikAkoRetazec(zasobnik);
		System.out.println(retazec);
		
		KruhovyZasobnik<Integer> cisla = new KruhovyZasobnik<Integer>(100);
		
		cisla.vloz(5);		// autoboxing - 5 (primitivny typ) -> referencny typ (Integer)
		cisla.vloz(10);
		
		int cislo = cisla.vyber();
	}

	private static String zasobnikAkoRetazec(KruhovyZasobnik<String> zasobnik)
	{
		StringBuilder builder = new StringBuilder();		// StringBuffer - viacvlaknove aplikacie, non-thread safe
		
		String prvok;
		while ((prvok = zasobnik.vyber()) != null)
		{
			builder.append(prvok);
			builder.append(NOVY_RIADOK);
		}
		return builder.toString();
	}
	
	
}
