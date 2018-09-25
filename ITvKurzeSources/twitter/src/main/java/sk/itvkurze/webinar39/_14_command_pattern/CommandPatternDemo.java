package sk.itvkurze.webinar39._14_command_pattern;

// client
public class CommandPatternDemo
{
	public static void main(String[] args)
	{
		Svetlo svetlo = new Svetlo();		// receiver
		Vypinac vypinacSvetla = new Vypinac();		// invoker
		
		// Prikaz zapniPrikaz = new ZapniPrikaz(svetlo);
		Prikaz zapniPrikaz = new PrepniPrikaz(svetlo);
		
		vypinacSvetla.ulozAVykonaj(zapniPrikaz);
		vypinacSvetla.ulozAVykonaj(zapniPrikaz);
		vypinacSvetla.ulozAVykonaj(zapniPrikaz);
		vypinacSvetla.ulozAVykonaj(zapniPrikaz);
	}
}
