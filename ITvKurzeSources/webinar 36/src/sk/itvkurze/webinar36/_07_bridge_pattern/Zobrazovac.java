package sk.itvkurze.webinar36._07_bridge_pattern;

import java.util.List;

public abstract class Zobrazovac
{
	public String zobraz(Formatovac formatovac)
	{
		return formatovac.naformatuj(getHlavicka(), getDetaily());
	}
	
	abstract protected List<Detail> getDetaily();
	
	abstract protected String getHlavicka();
}	
