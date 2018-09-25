package sk.itvkurze.webinar37._09_decorator_pattern;

public class SendvicDemo
{
	public static void main(String[] args)
	{
		// tzv. one-liner - najcastejsie pouzitie
		Sendvic sendvic = new DresingDekorator(new MasoDekorator(new JednoduchySendvic()));
		
		// pre lepsie pochopenie dekorator patternu
		/*
		JednoduchySendvic jednoduchySendvic = new JednoduchySendvic();
		MasoDekorator masoDekorator = new MasoDekorator(jednoduchySendvic);
		Sendvic sendvic = new DresingDekorator(masoDekorator);
		*/
		
		System.out.println(sendvic.vytvor());
	}
}
