package sk.itvkurze.webinar25._03_zoliky_kovarianty;

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
