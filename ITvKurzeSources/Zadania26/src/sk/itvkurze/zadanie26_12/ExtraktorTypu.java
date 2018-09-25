package sk.itvkurze.zadanie26_12;

public class ExtraktorTypu<T, K> {
	T hodnota1;
	K hodnota2;

	public ExtraktorTypu(T vstup1, K vstup2) {
		this.hodnota1 = vstup1;
		this.hodnota2 = vstup2;

	}

	public T getPrvyClen() {
		return this.hodnota1;
	}

	public K getDruhyClen() {
		return this.hodnota2;
	}

	public void zobrazTypy() {
		System.out.println("Typ premennej 1 je: " + this.hodnota1.getClass().getSimpleName());
		System.out.println("Typ premennej 2 je: " + this.hodnota2.getClass().getSimpleName());

	}
}
