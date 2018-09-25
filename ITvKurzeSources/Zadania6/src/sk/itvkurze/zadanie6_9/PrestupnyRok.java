package sk.itvkurze.zadanie6_9;

public class PrestupnyRok {
	int rok;

	public PrestupnyRok(int rok) {
		this.rok = rok;
	}

	public boolean jePrestupnyRok() {
		if (!(this.rok % 4 == 0)) {
			return false;
		} else {
			if (this.rok % 400 == 0) {
				return true;
			} else {
				if (this.rok % 100 == 0) {
					return false;
				} else
					return true;
			}
		}
	}
}
