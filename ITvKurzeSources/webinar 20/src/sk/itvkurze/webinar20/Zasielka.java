package sk.itvkurze.webinar20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Zasielka implements Iterable<Vyrobok> {

	private static final int CHYBAJUCI_VYROBOK = -1;

	private static final int HMOTNOSTNY_LIMIT = 20;

	private final List<Vyrobok> vyrobky = new ArrayList<>();
	private List<Vyrobok> lahsieVyrobky;
	private List<Vyrobok> tazssieVyrobky;

	public void pridajVyrobok(Vyrobok vyrobok) {
		vyrobky.add(vyrobok);
	}

	public void nahradVyrobok(Vyrobok povodnyVyrobok, Vyrobok novyVyrobok) {
		int index = vyrobky.indexOf(povodnyVyrobok);

		if (index != CHYBAJUCI_VYROBOK) {
			vyrobky.set(index, novyVyrobok);
		}
	}

	public void priprav() {
		// zotriedime si vyrobky
		vyrobky.sort(new Comparator<Vyrobok>() {

			@Override
			public int compare(Vyrobok o1, Vyrobok o2) {
				return Integer.compare(o1.getVaha(), o2.getVaha());
			}

		}); // alternativa
		// Collections.sort(vyrobky, Vyrobok.PODLA_HMOTNOSTI);
		
		// najdeme vyrobok, ktory ako prvy prekracuje vahovy limit, je tesne nad
		int indexVyrobkuTesneNadHmotnostnyLimit = najdiIndexVyrobkuPrekracujuciHmotLim();

		// roztriedime si vyrobky podla hmotnostneho limitu
		lahsieVyrobky = vyrobky.subList(0, indexVyrobkuTesneNadHmotnostnyLimit);
		tazssieVyrobky = vyrobky.subList(indexVyrobkuTesneNadHmotnostnyLimit, vyrobky.size());
	}

	private int najdiIndexVyrobkuPrekracujuciHmotLim() {
		for (int i = 0; i < vyrobky.size(); i++) {
			if (vyrobky.get(i).getVaha() >= HMOTNOSTNY_LIMIT) {
				return i;
			}
		}
		return CHYBAJUCI_VYROBOK;
	}

	public List<Vyrobok> getLahsieVyrobky() {
		return this.lahsieVyrobky;
	}

	public List<Vyrobok> getTazssieVyrobky() {
		return this.tazssieVyrobky;
	}

	@Override
	public String toString() {
		return "Zasielka [vyrobky=" + vyrobky + "]";
	}

	@Override
	public Iterator<Vyrobok> iterator() {
		return vyrobky.iterator();
	}

}
