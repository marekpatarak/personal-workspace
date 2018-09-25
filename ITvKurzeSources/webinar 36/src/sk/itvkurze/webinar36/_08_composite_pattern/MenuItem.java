package sk.itvkurze.webinar36._08_composite_pattern;

public class MenuItem extends KomponentaMenu
{

	public MenuItem(String nazov, String url)
	{
		this.nazov = nazov;
		this.url = url;
	}

	@Override
	public String toString()
	{
		return zobraz(this);
	}
}
