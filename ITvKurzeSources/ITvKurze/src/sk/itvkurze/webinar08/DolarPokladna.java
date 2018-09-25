package sk.itvkurze.webinar08;

public class DolarPokladna extends Pokladna {

	private String dolar = "$";

	@Override
	public String get_suma_v_pokladni() {

		return "Suma v Pokladni je:" + pokladna + this.dolar;
	}

}
