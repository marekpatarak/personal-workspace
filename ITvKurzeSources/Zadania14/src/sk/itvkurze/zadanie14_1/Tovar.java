package sk.itvkurze.zadanie14_1;

public class Tovar {
	String ID;
	String nazov;
	double cenaBezDPH;
	double sadzbaDPH;

	public Tovar(String ID, String nazov, double cenaBezDPH, double sadzbaDPH) {
		this.ID = ID;
		this.nazov = nazov;
		this.cenaBezDPH = cenaBezDPH;
		this.sadzbaDPH = sadzbaDPH;
	}

	protected double getCenaDPH() {
		return getCenaBezDPH() * (getSadzbaDPH() / 100);
	}
	////////////////////////////////////////////////////////////////////////

	protected String getNazov() {
		return nazov;
	}

	protected void setNazov(String nazov) {
		this.nazov = nazov;
	}

	protected double getCenaBezDPH() {
		return cenaBezDPH;
	}

	protected void setCenaBezDPH(double cenaBezDPH) {
		this.cenaBezDPH = cenaBezDPH;
	}

	protected double getSadzbaDPH() {
		return sadzbaDPH;
	}

	protected void setSadzbaDPH(double sadzbaDPH) {
		this.sadzbaDPH = sadzbaDPH;
	}

	@Override
	public String toString() {
		return getNazov() + " " + getCenaBezDPH() + " " + getSadzbaDPH();
	}

}
