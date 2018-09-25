package sk.itvkurze.zadanie26_5;

public class DvojicaHodnot<T, T1> {
	private T prvyClen;
	private T1 druhyClen;

	public DvojicaHodnot(T prvy, T1 druhy) {
		this.prvyClen = prvy;
		this.druhyClen = druhy;
	}

	protected T getPrvyClen() {
		return this.prvyClen;
	}

	protected T1 getDruhyClen() {
		return this.druhyClen;
	}

	protected void setPrvyClen(T clen) {
		this.prvyClen = clen;
	}

	protected void setDruhyClen(T1 clen) {
		this.druhyClen = clen;
	}


}
