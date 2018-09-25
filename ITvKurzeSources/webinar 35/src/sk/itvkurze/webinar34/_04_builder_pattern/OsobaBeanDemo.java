package sk.itvkurze.webinar34._04_builder_pattern;

public class OsobaBeanDemo
{
	public static void main(String[] args)
	{
		Osoba osoba = new Osoba();
		
		osoba.setId(1);
		osoba.setMeno("Igor");
		osoba.setPriezvisko("Kovac");
		osoba.setVek(22);
		osoba.jeMuz(true);
		
		System.out.println(osoba.getId());
		System.out.println(osoba.getMeno());
		System.out.println(osoba.getPriezvisko());
		System.out.println(osoba.getVek());
		System.out.println(osoba.jeMuz());
	}
}
