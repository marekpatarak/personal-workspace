package sk.itvkurze.zadanie26_3;

public class DvojicaHodnotUtil<T, G> {

	public static <T, G> DvojicaHodnot<G, T> vymenHodnotyParametrov(DvojicaHodnot<T, G> dvojica) {
		DvojicaHodnot<G, T> obratenaDvojica = new DvojicaHodnot<G, T>(dvojica.getDruhyClen(), dvojica.getPrvyClen());
		return obratenaDvojica;
	}
}
