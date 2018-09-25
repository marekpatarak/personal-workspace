package sk.itvkurze.webinar21.fronta;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

	private final Queue<Poziadavka> poziadavky = new ArrayDeque<>();

	public void zaregistrujPoziadavku(final Zakaznik zakaznik, final TypProblemu kategoria) {
		poziadavky.offer(new Poziadavka(zakaznik, kategoria));
	}

	// pomocou metody remove
	public void spracujVstkyPoziadavky() {
		while (!poziadavky.isEmpty()) {
			final Poziadavka poziadavka = poziadavky.remove();
			poziadavka.getZakaznik().poslatOdpoved("Skusal si dane zariadenie zapnut a vypnut?");
		}
	}

	// pomocou metody pool
	public void spracujVstkyPoziadavky2() {
		Poziadavka poziadavka;

		while ((poziadavka = poziadavky.poll()) != null) {
			poziadavka.getZakaznik().poslatOdpoved("Skusal si dane zariadenie zapnut a vypnut?");
		}
	}

	public static void main(String[] args) {
		HelpDesk helpDesk = new HelpDesk();

		helpDesk.zaregistrujPoziadavku(Zakaznik.EMIL, TypProblemu.POCITAC);
		helpDesk.zaregistrujPoziadavku(Zakaznik.IGOR, TypProblemu.TABLET);

		helpDesk.spracujVstkyPoziadavky();
	}
}
