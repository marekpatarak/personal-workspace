package sk.itvkurze.webinar21.fronta;

import static sk.itvkurze.webinar21.fronta.TypProblemu.TLACIAREN;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class VylepsenyHelpDesk {

	private Queue<Poziadavka> poziadavky = new ArrayDeque<>();

	public boolean zaregistrujPoziadavku(final Zakaznik zakaznik, final TypProblemu kategoria) {
		return poziadavky.offer(new Poziadavka(zakaznik, kategoria));
	}


	public void spracujPoziadavkuTlaciaren() {
		final Poziadavka poziadavka = poziadavky.peek();

		boolean jeProblemSTlaciarnou = poziadavka.getTypProblemu() == TLACIAREN;
		spracujPoziadavku(jeProblemSTlaciarnou, "Nedosiel nahodou papier v tlaciarni?", poziadavka);
	}

	public void spracujVseobecnuPoziadavku() {
		final Poziadavka poziadavka = poziadavky.peek();

		boolean jeProblemSTlaciarnou = poziadavka.getTypProblemu() != TLACIAREN;
		spracujPoziadavku(jeProblemSTlaciarnou, "Skusali ste uz dane zaraidenie znova vypnut a zapnut?", poziadavka);
	}

	public void spracujPoziadavku(boolean test, String sprava, Poziadavka poziadavka)
	{
		if (poziadavka != null && test)
		{
			poziadavky.remove();
			poziadavka.getZakaznik().poslatOdpoved(sprava);
		} else {
			System.out.println("Vas problem aktivne riesime, coskoro vas budeme kontaktovat ...");
		}
	}

	public static void main(String[] args) {
		VylepsenyHelpDesk helpDesk = new VylepsenyHelpDesk();

		helpDesk.zaregistrujPoziadavku(Zakaznik.EMIL, TypProblemu.POCITAC);
		helpDesk.zaregistrujPoziadavku(Zakaznik.IGOR, TypProblemu.TLACIAREN);

		helpDesk.spracujPoziadavkuTlaciaren();
		helpDesk.spracujVseobecnuPoziadavku();
		helpDesk.spracujPoziadavkuTlaciaren();
	}
}
