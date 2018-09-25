package sk.itvkurze.zadanie26_1;

public class DvojicaHodnot<T> {
	private T prvyClen;
	private T druhyClen;

	public DvojicaHodnot(T prvy, T druhy) {
		this.prvyClen = prvy;
		this.druhyClen = druhy;
	}

	public T getPrvyClen() {
		return this.prvyClen;
	}

	public T getDruhyClen() {
		return this.druhyClen;
	}

}
