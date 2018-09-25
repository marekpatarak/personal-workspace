package sk.itvkurze.zadanie6_14;

public class KonvertorJednotiekDlzky {
	String zCoho, doCoho;
	double hodnota;

	public KonvertorJednotiekDlzky(String zCoho, String doCoho, double hodnota) {
		this.zCoho = zCoho;
		this.doCoho = doCoho;
		this.hodnota = hodnota;
	}

	public void Konvertuj() {

		if (this.doCoho.equals("mm")) {
			System.out.println(this.hodnota + " " + this.zCoho + " >> " + this.doMilimetrov() + " " + this.doCoho);
		}

		if (this.doCoho.equals("m")) {
			System.out.println(this.hodnota + " " + this.zCoho + " >> " + this.doMetrov() + " " + this.doCoho);
		}

		if (this.doCoho.equals("km")) {
			System.out.println(this.hodnota + " " + this.zCoho + " >> " + this.doKilometrov() + " " + this.doCoho);
		}

		if (this.doCoho.equals("palce")) {
			System.out.println(this.hodnota + " " + this.zCoho + " >> " + this.doPalcov() + " " + this.doCoho);
		}
	}

	private double doMilimetrov() {

		if (this.zCoho.equals("mm")) {
			return this.hodnota;
		}
		if (this.zCoho.equals("m")) {
			return this.hodnota * 1000;
		}

		if (this.zCoho.equals("palce")) {
			return this.hodnota * 25.4;
		}

		if (this.zCoho.equals("km")) {
			return this.hodnota * 1000000;
		}
		return -1;
	}

	private double doMetrov() {

		if (this.zCoho.equals("m")) {
			return this.hodnota;
		}

		if (this.zCoho.equals("mm")) {
			return this.hodnota * 0.001;
		}

		if (this.zCoho.equals("palce")) {
			return this.hodnota * 0.0254;
		}

		if (this.zCoho.equals("km")) {
			return this.hodnota * 1000;
		}
		return -1;
	}

	private double doKilometrov() {

		if (this.zCoho.equals("km")) {
			return this.hodnota;
		}

		if (this.zCoho.equals("mm")) {
			return this.hodnota * 1000000;
		}

		if (this.zCoho.equals("palce")) {
			return this.hodnota * 0.0000254;
		}

		if (this.zCoho.equals("m")) {
			return this.hodnota * 0.001;
		}
		return -1;
	}

	private double doPalcov() {

		if (this.zCoho.equals("palce")) {
			return this.hodnota;
		}

		if (this.zCoho.equals("mm")) {
			return this.hodnota / 25.4;
		}

		if (this.zCoho.equals("km")) {
			return (this.hodnota * 100000) / 2.54;
		}

		if (this.zCoho.equals("m")) {
			return (this.hodnota * 100) / 2.54;
		}
		return -1;
	}
}
