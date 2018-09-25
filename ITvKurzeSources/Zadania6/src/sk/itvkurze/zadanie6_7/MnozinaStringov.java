package sk.itvkurze.zadanie6_7;

public class MnozinaStringov {
	String[] pole;

	public MnozinaStringov(String a, String b, String c) {
		this.pole = new String[3];
		this.pole[0] = a;
		this.pole[1] = b;
		this.pole[2] = c;

	}

	public void zorad() {
		String n;

		for (int i = 1; i < this.pole.length; i++) {
			if (this.pole[i - 1].length() > this.pole[i].length()) {
				n = this.pole[i - 1];
				this.pole[i - 1] = this.pole[i];
				this.pole[i] = n;
			}
		}
	}

	public String getNajkratsiRetazec() {

		return this.pole[0];
	}

	public String getProstrednyRetazec() {
		return this.pole[1];

	}

	public String getNajdlhsiRetazec() {
		return this.pole[2];

	}

}
