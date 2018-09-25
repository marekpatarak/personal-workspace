package sk.itvkurze.webinar34._04_builder_pattern;

public class OsobaTelescopingDemo
{
	public static void main(String[] args)
	{
		OsobaTelescoping osoba = new OsobaTelescoping(1, "Igor", "Peev", 23, true);
		
		System.out.println(osoba.getId());
		System.out.println(osoba.getMeno());
		System.out.println(osoba.getPriezvisko());
		System.out.println(osoba.getVek());
		System.out.println(osoba.jeMuz());
	}
}
