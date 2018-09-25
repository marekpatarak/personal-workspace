package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

/**
 * Handler
 */
public abstract class Schvalovatel
{
	protected Schvalovatel schvalovatel;
	
	public void setSchvalovatel(Schvalovatel schvalovatel)
	{
		this.schvalovatel = schvalovatel;
	}
	
	public abstract void spracujZiadost(Ziadost ziadost);
}
