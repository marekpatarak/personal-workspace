package sk.itvkurze.webinar08;


public class PokladnaTester {

	public static void main(String[] args) {

		Tovar chladnicka = new Tovar("Calex", 59.99);
		Tovar mraznicka = new Tovar("Zanussi", -59.99);

		System.out.println("Nazov chladnicky: " + chladnicka.get_nazov());
		System.out.println("Cena chladnicky: " + chladnicka.get_cena());
		System.out.println("Nazov mraznicky: " + mraznicka.get_nazov());
		System.out.println("Cena chladnicky: " + mraznicka.get_cena());
		System.out.println();

		chladnicka.set_nazov("Samsung");
		mraznicka.set_nazov("Fagor");
		chladnicka.set_cena(69.99);
		mraznicka.set_cena(89.99);

		chladnicka.vypisInfoTovar();
		mraznicka.vypisInfoTovar();
		System.out.println();

		System.out.println("Nazov chladnicky: " + chladnicka.get_nazov());
		System.out.println("Cena chladnicky: " + chladnicka.get_cena());
		System.out.println("Nazov mraznicky: " + mraznicka.get_nazov());
		System.out.println("Cena chladnicky: " + mraznicka.get_cena());
		System.out.println();

		CeskaPokladna pokladnaCZK = new CeskaPokladna();
		DolarPokladna pokladnaUSD = new DolarPokladna();

		pokladnaCZK.naskenuj_tovar(chladnicka);
		pokladnaUSD.naskenuj_tovar(mraznicka);

		pokladnaCZK.prijmi_peniaze(0, 0, 0, 0, 0, 0, 0, 0);
		System.out.println(pokladnaCZK.get_suma_v_pokladni());
		pokladnaCZK.prijmi_peniaze(1, 1, 1, 1, 1, 1, 1, 1);
		System.out.println(pokladnaCZK.get_suma_v_pokladni());
		pokladnaCZK.prijmi_peniaze(-2, -2, -2, -2, -2, -2, -2, -2);
		System.out.println(pokladnaCZK.get_suma_v_pokladni());
		System.out.println();

		pokladnaUSD.prijmi_peniaze(0, 0, 0, 0, 0, 0, 0, 0);
		System.out.println(pokladnaUSD.get_suma_v_pokladni());
		pokladnaUSD.prijmi_peniaze(1, 1, 1, 1, 1, 1, 1, 1);
		System.out.println(pokladnaUSD.get_suma_v_pokladni());
		pokladnaUSD.prijmi_peniaze(-2, -2, -2, -2, -2, -2, -2, -2);
		System.out.println(pokladnaUSD.get_suma_v_pokladni());
		System.out.println();

		pokladnaUSD.vloz_peniaze(400);
		pokladnaCZK.vloz_peniaze(500);
		System.out.println(pokladnaUSD.get_suma_v_pokladni());
		System.out.println(pokladnaCZK.get_suma_v_pokladni());

	}

}
