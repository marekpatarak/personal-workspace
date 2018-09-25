package sk.itvkurze.webinar21.mapy;

import java.util.HashMap;
import java.util.Map;

public class VyhladavacVyrobkovAkoMapa implements VyhladavacVyrobkov {

	private final Map<Integer, Vyrobok> idNaVyrobok = new HashMap<>(); // najcastejsia konvencia mapovania co na co

	@Override
	public void pridajVyrobok(Vyrobok vyrobok) {
		if (idNaVyrobok.containsKey(vyrobok.getId())) {
			throw new IllegalArgumentException(
					"Nie je mozne pridat vyrobok, jedna sa o duplicitny vyrobok s id: " + vyrobok.getId());
		}
		idNaVyrobok.put(vyrobok.getId(), vyrobok);
	}

	@Override
	public Vyrobok vyhladajVyrobokPodla(int id) {
		return idNaVyrobok.get(id);
	}

	@Override
	public void clear() {
		idNaVyrobok.clear();
	}

}
