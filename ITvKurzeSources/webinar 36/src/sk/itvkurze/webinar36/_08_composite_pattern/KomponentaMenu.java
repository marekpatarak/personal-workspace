package sk.itvkurze.webinar36._08_composite_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class KomponentaMenu
{
	String nazov;
	String url;
	List<KomponentaMenu> komponentyMenu = new ArrayList<>();
	
	public String getMeno() 
	{
		return nazov;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public abstract String toString();
	
	String zobraz(KomponentaMenu komponentaMenu)
	{
		StringBuilder builder = new StringBuilder(komponentaMenu.nazov);
		builder.append(": ");
		builder.append(komponentaMenu.url);
		builder.append("\n");
		return builder.toString();
	}

	public KomponentaMenu vloz(KomponentaMenu komponentaMenu)
	{
		throw new UnsupportedOperationException("Feature nie je implementovana na tejto urovni");
	}

	public KomponentaMenu odober(KomponentaMenu komponentaMenu)
	{
		throw new UnsupportedOperationException("Feature nie je implementovana na tejto urovni");
	}
}
