package sk.itvkurze.webinar36._08_composite_pattern;

public class CompositePatternMenuTester
{
	public static void main(String[] args)
	{
		Menu hlavneMenu = new Menu("Hlavne", "/hlavne");
		MenuItem podmenuBezpecnost = new MenuItem("Bezpecnost", "/bezpecnost");
		
		hlavneMenu.vloz(podmenuBezpecnost);
		
		Menu podmenuPotvrdenia = new Menu("Potvrdenia", "/potvrdenia");
		
		MenuItem osobnePotvrdenia = new MenuItem("Osobne potvrdenia", "/osobnePotvrdenia");
		
		hlavneMenu.vloz(podmenuPotvrdenia);
		
		podmenuPotvrdenia.vloz(osobnePotvrdenia);
		
		System.out.println(hlavneMenu.toString());
	}
	
}
