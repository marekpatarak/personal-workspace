package sk.itvkurze.webinar21.fronta;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static sk.itvkurze.webinar21.fronta.TypProblemu.TLACIAREN;

public class VylepsenyHelpDeskJDK8 {

	private Queue<Poziadavka> poziadavky = new ArrayDeque<>();

	public boolean zaregistrujPoziadavku(final Zakaznik zakaznik, final TypProblemu kategoria) {
		return poziadavky.offer(new Poziadavka(zakaznik, kategoria));
	}

	public void spracujPoziadavkuTlaciaren() {
		spracujPoziadavku(poziadavka -> poziadavka.getTypProblemu() == TLACIAREN,
				"Nedosiel nahodou papier v tlaciarni?");
	}

	public void spracujVseobecnuPoziadavku() {
		spracujPoziadavku(poziadavka -> poziadavka.getTypProblemu() != TLACIAREN,
				"Skusali ste uz dane zaraidenie znova vypnut a zapnut?");
	}

	public void spracujPoziadavku(Predicate<Poziadavka> predikat, final String sprava) {
		final Poziadavka poziadavka = poziadavky.peek();
		if (poziadavka != null && predikat.test(poziadavka)) {
			poziadavky.remove();
			poziadavka.getZakaznik().poslatOdpoved(sprava);
		} else {
			System.out.println("Vas problem aktivne riesime, coskoro vas budeme kontaktovat ...");
		}
	}

	public static void main(String[] args) {
		VylepsenyHelpDeskJDK8 helpDesk = new VylepsenyHelpDeskJDK8();

		helpDesk.zaregistrujPoziadavku(Zakaznik.EMIL, TypProblemu.POCITAC);
		helpDesk.zaregistrujPoziadavku(Zakaznik.IGOR, TypProblemu.TLACIAREN);

		helpDesk.spracujPoziadavkuTlaciaren();
		helpDesk.spracujVseobecnuPoziadavku();
		helpDesk.spracujPoziadavkuTlaciaren();
	}
}
