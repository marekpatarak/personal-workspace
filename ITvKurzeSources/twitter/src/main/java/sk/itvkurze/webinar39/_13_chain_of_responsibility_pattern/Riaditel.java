package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

public class Riaditel extends Schvalovatel
{

	@Override
	public void spracujZiadost(Ziadost ziadost)
	{
		if (ziadost.getTypZiadosti() == ZiadostTyp.KONFERENCIA)
		{
			System.out.println("Riaditel moze schvalovat konferencie");
		}
		
		else {
			schvalovatel.spracujZiadost(ziadost);
		}
	}	
	
}
