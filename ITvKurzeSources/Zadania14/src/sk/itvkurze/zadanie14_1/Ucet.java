package sk.itvkurze.zadanie14_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ucet extends Pokladna {
	protected Calendar date;
	protected int cisloNakupu;
	protected double sumaNakupu;

	public Ucet() {
		this.cisloNakupu = super.getPocetNakupov() + 1;
		this.date = Calendar.getInstance();
		this.aktNakup = super.aktNakup;
		this.aktPlatba = super.aktPlatba;
	}

	public void vypisUcet() {
		System.out.println("**************Ucet c." + this.cisloNakupu + " **************");
		System.out.println(Pokladna.uctJednotka);
		System.out.println(pobocka);
		String strdate = "";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:MM");

		if (this.date != null) {
			strdate = sdf.format(this.date.getTime());
		}

		System.out.println(strdate);
		this.vypisKosik();
		System.out.println("Zaplatene: " + this.getSumaPlatby());
		System.out.println("Vydavok: " + (this.getSumaPlatby() - this.getSumaKosik()));
		System.out.println("************** Dakujeme za nakup ****************");

	}
}
