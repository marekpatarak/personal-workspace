package sk.itvkurze.zadanie26_3;

public class DvojicaHodnot<T, G> {
	private T prvyClen;
	private G druhyClen;

	public DvojicaHodnot(T prvy, G druhy) {
		this.prvyClen = prvy;
		this.druhyClen = druhy;
	}

	protected T getPrvyClen() {
		return this.prvyClen;
	}

	protected G getDruhyClen() {
		return this.druhyClen;
	}

	protected void setPrvyClen(T clen) {
		this.prvyClen = clen;
	}

	protected void setDruhyClen(G clen) {
		this.druhyClen = clen;
	}


}
