package sk.itvkurze.webinar21.mnoziny;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProduktovyKatalog implements Iterable<Vyrobok> {

	private final SortedSet<Vyrobok> vyrobky = new TreeSet<>(Vyrobok.PODLA_HMOTNOSTI); // new ArrayList<>() ukazat ze
																						// sme potlacili duplicity
	private static final int HMOTNOSTNY_LIMIT = 20;

	public void jeDodavany(Dodavatel dodavatel) {
		vyrobky.addAll(dodavatel.getVyrobky());
	}

	public Set<Vyrobok> getLahkeVyrobky() {
		Vyrobok najlahsiTazkyVyrobok = najdiNajlahsiTazkyVyrobok();
		return vyrobky.headSet(najlahsiTazkyVyrobok);

		// 1, 2, 3, 4, 5
		// cisla.headSet(3) -> 1, 2
	}

	public Set<Vyrobok> getTazkeVyrobky() {
		Vyrobok najlahsiTazkyVyrobok = najdiNajlahsiTazkyVyrobok();
		return vyrobky.tailSet(najlahsiTazkyVyrobok);

		// 1, 2, 3, 4, 5
		// cisla.tailSet(3) -> 3, 4, 5
	}

	private Vyrobok najdiNajlahsiTazkyVyrobok() {
		for (Vyrobok vyrobok : vyrobky) {
			if (vyrobok.getVaha() >= HMOTNOSTNY_LIMIT) {
				return vyrobok;
			}
		}
		return vyrobky.last();
	}


	@Override
	public Iterator<Vyrobok> iterator() {
		return vyrobky.iterator();
	}

	@Override
	public String toString() {
		return vyrobky.toString();
	}
}
