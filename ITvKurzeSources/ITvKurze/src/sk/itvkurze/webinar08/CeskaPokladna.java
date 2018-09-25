package sk.itvkurze.webinar08;

public class CeskaPokladna extends Pokladna {

	private String ceska_koruna = "CZK";

	@Override
	public String get_suma_v_pokladni() {

		return "Suma v Pokladni je" + pokladna + this.ceska_koruna;
	}

}
