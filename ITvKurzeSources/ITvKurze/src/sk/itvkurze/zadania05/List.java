package sk.itvkurze.zadania05;

public class List {
	private String odosielatel;
	private String prijimatel;
	private String teloListu;

	public List(String odosielatel, String prijimatel) {
		this.odosielatel = odosielatel;
		this.prijimatel = prijimatel;
		this.teloListu = "";
	}

	public void pridajRiadok(String riadok) {
		this.teloListu = this.teloListu + riadok + "\n";
	}

	public String getText() {
		return "Draha " + this.prijimatel + "\n" + "\n" + this.teloListu + "\n" + "S pozdravom" + "\n"
				+ this.odosielatel;
			
		}

}
