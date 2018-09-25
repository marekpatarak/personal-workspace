package sk.itvkurze.webinar37._09_decorator_pattern;

public class DresingDekorator extends SendvicDekorator
{

	public DresingDekorator(Sendvic vlastnySendvic)
	{
		super(vlastnySendvic);
	}

	@Override
	public String vytvor()
	{
		return vlastnySendvic.vytvor() + pridajDresing();
	}

	private String pridajDresing()
	{
		return " + smotanovy dresing";
	}
}
