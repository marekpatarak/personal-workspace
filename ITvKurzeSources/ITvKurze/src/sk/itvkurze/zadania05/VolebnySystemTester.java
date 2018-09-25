package sk.itvkurze.zadania05;

public class VolebnySystemTester {

	public static void main(String[] args) {
		VolebnySystem volby = new VolebnySystem();

		volby.vypisAktStav();

		volby.hlasujLavica();
		volby.hlasujLavica();
		volby.hlasujPravica();

		volby.vypisAktStav();

		volby.hlasujPravica();
		volby.hlasujPravica();

		volby.vypisAktStav();

		volby.zresetujStav();

		volby.vypisAktStav();

	}

}
