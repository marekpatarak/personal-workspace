package sk.itvkurze.zadanie26_7;

import java.util.Set;

public class HashSet<T> {

	Set<T> sada;

	public void vloz(T vstup) {
		this.sada.add(vstup);
	}

	public int getVelkost() {
		return this.sada.size();
	}

	public void zmaz(T vstup) {
		this.sada.remove(vstup);
	}

	public Iterator<T> iterator() {

		return (Iterator<T>) this.sada.iterator();
	}

}
