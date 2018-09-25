package sk.itvkurze.webinar34._04_builder_pattern;

public class ImmutableOsobaDemo
{
	public static void main(String[] args)
	{
		ImmutableOsoba.Builder builder = new ImmutableOsoba.Builder();
		builder.id(1)
			   .meno("Igor")
			   .priezvisko("Peev")
			   .vek(32)
			   .jeMuz(true);
		
		ImmutableOsoba osoba = builder.build();
		
		System.out.println(osoba.getId());
		System.out.println(osoba.getMeno());
		System.out.println(osoba.getPriezvisko());
		System.out.println(osoba.getVek());
		System.out.println(osoba.jeMuz());
	}
}
