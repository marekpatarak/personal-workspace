package sk.itvkurze.webinar18.impl;

public class Osoba {
	private String meno, priezvisko;
	private int vek;

	public Osoba(String meno, String priezvisko, int vek) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		if (vek <= 0) {
			throw (IllegalArgumentException);
		}
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public String getPriezvisko() {
		return priezvisko;
	}

	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}

	public int getVek() {
		return vek;
	}

	public void setVek(int vek) {
		this.vek = vek;
	}

}
