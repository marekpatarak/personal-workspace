package sk.itvkurze.zadania05;

public class ZobrazovacListu {

	public static void main(String[] args) {
		List list = new List("Janko", "Katka");

		list.pridajRiadok("Pisem ti z mexickeho vezenia.");
		list.pridajRiadok("Je tu dobre, asi zostavam.");
		list.pridajRiadok("Zelam Ti vsetko dobre.");

		System.out.println(list.getText());

	}

}
