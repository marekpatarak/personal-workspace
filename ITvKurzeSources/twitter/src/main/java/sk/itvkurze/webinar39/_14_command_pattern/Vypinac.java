package sk.itvkurze.webinar39._14_command_pattern;
// Invoker
public class Vypinac
{
	public void ulozAVykonaj(Prikaz prikaz)
	{
		prikaz.vykonaj();
	}
}
