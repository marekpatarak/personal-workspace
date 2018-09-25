package sk.itvkurze.webinar25._03_zoliky_neohranicene;

// spoluvlastnik firmy
public class ObchodnyPartner extends Osoba
{

	public ObchodnyPartner(String meno, int vek)
	{
		super(meno, vek);
	}

	@Override
	public String toString()
	{
		return "ObchodnyPartner{" +
				"meno'" + getMeno() + '\'' +
				", vek=" + getVek() +
		'}';
	}
	
	
}
