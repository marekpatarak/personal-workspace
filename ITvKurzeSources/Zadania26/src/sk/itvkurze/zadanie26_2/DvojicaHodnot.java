package sk.itvkurze.zadanie26_2;

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

	private void setPrvyClen(T clen) {
		this.prvyClen = clen;
	}

	private void setDruhyClen(T clen) {
		this.druhyClen = clen;
	}

	public void vymenHodnotyParametrov() {
		T swap = this.getPrvyClen();
		this.setPrvyClen(this.getDruhyClen());
		this.setDruhyClen(swap);
	}

}
