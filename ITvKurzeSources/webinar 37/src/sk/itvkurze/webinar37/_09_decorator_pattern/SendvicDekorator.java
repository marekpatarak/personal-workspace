package sk.itvkurze.webinar37._09_decorator_pattern;

public abstract class SendvicDekorator implements Sendvic
{
	protected Sendvic vlastnySendvic;
	
	public SendvicDekorator(Sendvic vlastnySendvic)
	{
		this.vlastnySendvic = vlastnySendvic;
	}
	
	public String vytvor()
	{
		return vlastnySendvic.vytvor();
	}
}
