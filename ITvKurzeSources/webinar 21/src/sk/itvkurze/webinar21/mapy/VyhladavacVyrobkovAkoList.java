package sk.itvkurze.webinar21.mapy;

import java.util.ArrayList;
import java.util.List;

public class VyhladavacVyrobkovAkoList implements VyhladavacVyrobkov {

	private List<Vyrobok> vyrobky = new ArrayList<>();

	@Override
	public void pridajVyrobok(Vyrobok novyVyrobok) {

		for (Vyrobok vyrobok : vyrobky) {
			if (vyrobok.getId() == novyVyrobok.getId()) {
				throw new IllegalArgumentException(
						"Nie je mozne pridat vyrobok, jedna sa o duplicitny vyrobok s id: " + novyVyrobok.getId());
			}
		}

		vyrobky.add(novyVyrobok);
	}

	@Override
	public Vyrobok vyhladajVyrobokPodla(int id) {

		for (Vyrobok vyrobok : vyrobky) {
			if (vyrobok.getId() == id) {
				return vyrobok;
			}
		}

		return null;
	}

	@Override
	public void clear() {
		vyrobky.clear();
	}
}
