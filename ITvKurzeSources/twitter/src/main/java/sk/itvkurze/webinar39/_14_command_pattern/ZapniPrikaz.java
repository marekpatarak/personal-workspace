package sk.itvkurze.webinar39._14_command_pattern;
// concrete command
public class ZapniPrikaz implements Prikaz
{
	private Svetlo svetlo;
	
	public ZapniPrikaz(Svetlo svetlo)
	{
		this.svetlo = svetlo;
	}
	
	@Override
	public void vykonaj()
	{
		this.svetlo.zazni();
	}

}
