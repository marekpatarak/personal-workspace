package sk.itvkurze.webinar36._07_bridge_pattern.objekty2;

public class Stvorec extends Objekt
{
	public Stvorec(Farba farba)
	{
		super(farba);
	}
	
	@Override
	public void aplikujFarbu()
	{
		farba.aplikujFarbu();
	}
}
