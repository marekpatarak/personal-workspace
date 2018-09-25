package sk.itvkurze.webinar39._14_command_pattern;
// concrete command
public class PrepniPrikaz implements Prikaz
{
	private Svetlo svetlo;
	
	public PrepniPrikaz(Svetlo svetlo)
	{
		this.svetlo = svetlo;
	}
	
	@Override
	public void vykonaj()
	{
		this.svetlo.prepni();
	}

}
