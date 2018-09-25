package sk.itvkurze.webinar21.prioritna_fronta;

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

	@Override
	public String toString()
	{
		return "Zakaznik [meno=" + meno + "]";
	}

}
