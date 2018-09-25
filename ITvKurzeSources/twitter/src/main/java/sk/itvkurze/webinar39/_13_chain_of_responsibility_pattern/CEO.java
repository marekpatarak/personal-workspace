package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

public class CEO extends Schvalovatel
{

	@Override
	public void spracujZiadost(Ziadost ziadost)
	{
		System.out.println("CEO moze schvalit akukolvek ziadost");
	}

}
