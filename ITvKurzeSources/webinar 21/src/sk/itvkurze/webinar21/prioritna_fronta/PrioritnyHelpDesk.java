package sk.itvkurze.webinar21.prioritna_fronta;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioritnyHelpDesk {

	private static final Comparator<Poziadavka> PODLA_TYPU_PROBLEMU = new Comparator<>() {

		@Override
		public int compare(Poziadavka p1, Poziadavka p2) {
			return p1.getTypProblemu().compareTo(p2.getTypProblemu());
		}
	};

	private final Queue<Poziadavka> poziadavky = new PriorityQueue<>(PODLA_TYPU_PROBLEMU);

	public void zaregistrujPoziadavku(final Zakaznik zakaznik, final TypProblemu typProblemu) {
		Poziadavka poziadavka = new Poziadavka(zakaznik, typProblemu);
		System.out.println("Vkladam: " + poziadavka);
		poziadavky.offer(poziadavka);
	}

	// pomocou metody pool
	public void spracujVstkyPoziadavky() {
		Poziadavka poziadavka;

		while ((poziadavka = poziadavky.poll()) != null) {
			System.out.println("Vyberam: " + poziadavka);
			poziadavka.getZakaznik().poslatOdpoved("Skusal si dane zariadenie zapnut a vypnut?");
		}
	}

	public static void main(String[] args) {
		PrioritnyHelpDesk helpDesk = new PrioritnyHelpDesk();

		helpDesk.zaregistrujPoziadavku(Zakaznik.IGOR, TypProblemu.TABLET);
		helpDesk.zaregistrujPoziadavku(Zakaznik.PETER, TypProblemu.TELEFON);
		helpDesk.zaregistrujPoziadavku(Zakaznik.EMIL, TypProblemu.POCITAC);

		helpDesk.spracujVstkyPoziadavky();
	}
}
