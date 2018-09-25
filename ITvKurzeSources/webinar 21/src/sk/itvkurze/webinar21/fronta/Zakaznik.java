package sk.itvkurze.webinar21.fronta;

public class Zakaznik {

	public static final Zakaznik IGOR = new Zakaznik("Igor");
	public static final Zakaznik PETER = new Zakaznik("Peter");
	public static final Zakaznik EMIL = new Zakaznik("Emil");

	private final String meno;

	public Zakaznik(final String meno) {
		this.meno = meno;
	}

	public void poslatOdpoved(final String sprava) {
		System.out.printf("%s: %s\n", meno, sprava);
	}

	public static final Zakaznik getTestZakaznik1()
	{
		return new Zakaznik("Igor");
	}

	public static final Zakaznik getTestZakaznik2()
	{
		return new Zakaznik("Peter");
	}

	public static final Zakaznik getTestZakaznik3()
	{
		return new Zakaznik("Email");
	}
}
