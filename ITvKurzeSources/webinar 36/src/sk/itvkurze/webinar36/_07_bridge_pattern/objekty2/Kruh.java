package sk.itvkurze.webinar36._07_bridge_pattern.objekty2;

public class Kruh extends Objekt
{	
	public Kruh(Farba farba)
	{
		super(farba);
	}
	
	@Override
	public void aplikujFarbu()
	{
		farba.aplikujFarbu();
	}
}
