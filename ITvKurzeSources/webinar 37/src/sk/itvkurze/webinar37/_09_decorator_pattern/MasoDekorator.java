package sk.itvkurze.webinar37._09_decorator_pattern;

public class MasoDekorator extends SendvicDekorator
{

	public MasoDekorator(Sendvic vlastnySendvic)
	{
		super(vlastnySendvic);
	}
	
	public String vytvor()
	{
		return vlastnySendvic.vytvor() + pridajMaso();
	}
	
	private String pridajMaso() 
	{
		return " + kuracie masko";
	}
}
