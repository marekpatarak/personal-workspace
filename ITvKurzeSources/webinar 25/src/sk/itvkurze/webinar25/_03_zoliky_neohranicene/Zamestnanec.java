package sk.itvkurze.webinar25._03_zoliky_neohranicene;

public class Zamestnanec extends Osoba
{

	public Zamestnanec(String meno, int vek)
	{
		super(meno, vek);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Zamestnanec{" +
				"meno'" + getMeno() + '\'' +
				", vek=" + getVek() +
		'}';
	}

	
}
