package sk.itvkurze.webinar38._11_flyweight_pattern;

public class SystemInventarizacieDemo
{
	public static void main(String[] args)
	{
		SystemInventarizacie system = new SystemInventarizacie();
		
		system.prijmiObjednavku("Samsung TV", 123);
		system.prijmiObjednavku("Philips TV", 233);
		system.prijmiObjednavku("Samsung TV", 111);
		system.prijmiObjednavku("Orava TV", 66);
		system.prijmiObjednavku("Orava TV", 67);
		system.prijmiObjednavku("Samsung TV", 455);
		system.prijmiObjednavku("Samsung TV", 700);
		system.prijmiObjednavku("Philips TV", 600);
		
		system.spracujObjednavky();
		System.out.println(system.vytvorReport());
	}
}
