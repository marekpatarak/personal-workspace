package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

public class Ziadost
{
	private ZiadostTyp typZiadosti;
	private double ciastka;
	
	public Ziadost(ZiadostTyp typZiadosti, double ciastka)
	{
		this.typZiadosti = typZiadosti;
		this.ciastka = ciastka;
	}
	
	public ZiadostTyp getTypZiadosti()
	{
		return this.typZiadosti;
	}
	
	public double getCiastka()
	{
		return this.ciastka;
	}
}
