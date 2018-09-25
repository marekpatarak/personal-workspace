package sk.itvkurze.webinar37._08_composite_pattern;

import java.util.Iterator;

public class Menu extends KomponentaMenu
{

	public Menu(String nazov, String url)
	{
		this.nazov = nazov;
		this.url = url;
	}

	@Override
	public KomponentaMenu vloz(KomponentaMenu komponentaMenu)
	{
		komponentyMenu.add(komponentaMenu);
		return komponentaMenu;
	}
	
	@Override
	public KomponentaMenu odober(KomponentaMenu komponentaMenu)
	{
		komponentyMenu.remove(komponentaMenu);
		return komponentaMenu;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();		// builder pattern
		
		builder.append(zobraz(this));
		
		Iterator<KomponentaMenu> iterator = komponentyMenu.iterator();
		
		while (iterator.hasNext())
		{
			KomponentaMenu komponentaMenu = iterator.next();
			builder.append(komponentaMenu.toString());
		}
		
		return builder.toString();
	}
}
