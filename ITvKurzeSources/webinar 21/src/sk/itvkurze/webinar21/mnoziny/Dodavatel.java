package sk.itvkurze.webinar21.mnoziny;

import java.util.HashSet;
import java.util.Set;

public class Dodavatel {

	private String nazov;

	private Set<Vyrobok> vyrobky = new HashSet<>();

	public Dodavatel(String nazov) {
		this.nazov = nazov;
	}

	public Set<Vyrobok> getVyrobky() {
		return this.vyrobky;
	}
}
