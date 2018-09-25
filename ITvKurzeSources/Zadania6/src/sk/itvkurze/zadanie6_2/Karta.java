package sk.itvkurze.zadanie6_2;

public class Karta {
	String typKartyKod, farbaKartyKod;

	public Karta(String skrPopis) {

		if (skrPopis.length() == 2) {
			this.typKartyKod = skrPopis.substring(0, 1);
			this.farbaKartyKod = skrPopis.substring(1, 2);
		} else {
			if (skrPopis.length() == 3) {
				this.typKartyKod = skrPopis.substring(0, 2);
				this.farbaKartyKod = skrPopis.substring(2, 3);
			} else {
				this.typKartyKod = "";
				this.farbaKartyKod = "";
			}

		}
	}

	public String getFullPopis() {
		if (this.vratTypFull().equals("") || this.vratFarbuFull().equals("")) {
			return "Neznama Karta";
		} else {
			return this.vratTypFull() + " " + this.vratFarbuFull();
		}
	}

	private String vratFarbuFull() {
		switch (this.farbaKartyKod) {
		case "C":
			return "Cerven";
		case "Z":
			return "Zelen";
		case "M":
			return "Mak";
		case "G":
			return "Gula";
		default:
			return "";
		}
	}

	private String vratTypFull() {
		switch (this.typKartyKod) {
		case "D":
			return "Dolnik";
		case "H":
			return "Hornik";
		case "K":
			return "Kral";
		case "E":
			return "Eso";
		case "2":
			return "Dvojka";
		case "3":
			return "Trojka";
		case "4":
			return "Stvorka";
		case "5":
			return "P‰ùka";
		case "6":
			return "Sestka";
		case "7":
			return "Sedmicka";
		case "8":
			return "Osmicka";
		case "9":
			return "Deviatka";
		case "10":
			return "Desiatka";
		default:
			return "";
		}

	}
}
