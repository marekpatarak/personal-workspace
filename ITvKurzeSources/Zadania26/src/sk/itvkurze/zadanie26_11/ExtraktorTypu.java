package sk.itvkurze.zadanie26_11;

public class ExtraktorTypu<T> {
	T hodnota;

	public ExtraktorTypu(T vstup) {
		this.hodnota = vstup;
	}

	public T getHodnota() {
		return this.hodnota;
	}

	public void zobrazTyp() {
		System.out.println("Typ premennej je: " + this.hodnota.getClass().getSimpleName());
	}
}
