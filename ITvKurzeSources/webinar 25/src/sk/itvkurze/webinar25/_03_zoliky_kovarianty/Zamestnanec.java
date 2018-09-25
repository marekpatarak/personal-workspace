package sk.itvkurze.webinar25._03_zoliky_kovarianty;

public class Zamestnanec extends Osoba
{

	public Zamestnanec(String meno, int vek)
	{
		super(meno, vek);
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
