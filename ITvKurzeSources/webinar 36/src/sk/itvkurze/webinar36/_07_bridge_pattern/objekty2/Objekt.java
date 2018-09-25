package sk.itvkurze.webinar36._07_bridge_pattern.objekty2;

public abstract class Objekt
{
	protected Farba farba;
	
	public Objekt(Farba farba)
	{
		this.farba = farba;
	}
	
	abstract public void aplikujFarbu();
}
