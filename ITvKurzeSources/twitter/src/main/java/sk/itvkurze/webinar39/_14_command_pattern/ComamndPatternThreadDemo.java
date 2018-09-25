package sk.itvkurze.webinar39._14_command_pattern;
public class ComamndPatternThreadDemo
{
	public static void main(String[] args)
	{
		Uloha uloha1 = new Uloha(5 , 12);
		Uloha uloha2 = new Uloha(6 , 30);

		Thread vlakno1 = new Thread(uloha1);
		vlakno1.start();

		Thread vlakno2 = new Thread(uloha2);
		vlakno2.start();
	}
}

class Uloha implements Runnable
{
	private double cislo1;
	private double cislo2;
	
	public Uloha(double cislo1, double cislo2)
	{
		this.cislo1 = cislo1;
		this.cislo2 = cislo2;
	}
	
	@Override
	public void run()	// execute method
	{
		System.out.println(cislo1 * cislo2);   // receiver je samotna konzola
	}
	
	
}
