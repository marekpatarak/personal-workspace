package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

public class ProjektovyManazer extends Schvalovatel
{

	@Override
	public void spracujZiadost(Ziadost ziadost)
	{
		if (ziadost.getTypZiadosti() == ZiadostTyp.BENEFITPLUS) 
		{
			System.out.println("Projektovy manazer moze schvalovat BENEFITPLUS");
		}
		else 
		{
			schvalovatel.spracujZiadost(ziadost);
		}
	}

}
