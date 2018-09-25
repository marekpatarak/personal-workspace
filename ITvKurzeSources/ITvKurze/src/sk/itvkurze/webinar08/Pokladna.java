package sk.itvkurze.webinar08;

abstract public class Pokladna {

	private Tovar[] poleTovarov;
	int pokladna = 0;

	public Pokladna() {
		this.poleTovarov = new Tovar[1000];
	}

	public abstract String get_suma_v_pokladni();

	public void naskenuj_tovar(Tovar tovar) {
		int index_tovaru = 0;
		if (index_tovaru < this.poleTovarov.length) {
			this.poleTovarov[index_tovaru] = tovar;
			System.out.println(tovar.get_nazov() + " bol naskenovany a ulozeny do pola Tovarov");
			index_tovaru += 1;
		}
	}

	public void prijmi_peniaze(int pocet_500_bankoviek, int pocet_100_bankoviek, int pocet_50_bankoviek,
			int pocet_20_bankoviek, int pocet_10_bankoviek, int pocet_5_bankoviek, int pocet_2_bankoviek,
			int pocet_1_bankoviek) {
		int suma_z_500 = pocet_500_bankoviek * 500;
		int suma_z_100 = pocet_100_bankoviek * 100;
		int suma_z_50 = pocet_50_bankoviek * 50;
		int suma_z_20 = pocet_20_bankoviek * 20;
		int suma_z_10 = pocet_10_bankoviek * 10;
		int suma_z_5 = pocet_5_bankoviek * 5;
		int suma_z_2 = pocet_2_bankoviek * 2;
		int suma_z_1 = pocet_1_bankoviek * 1;
		int total = suma_z_500 + suma_z_100 + suma_z_50 + suma_z_20 + suma_z_10 + suma_z_5 + suma_z_2 + suma_z_1;
		pokladna += total;
	}

	public void vloz_peniaze(double suma) {
		pokladna += suma;

	}

}
