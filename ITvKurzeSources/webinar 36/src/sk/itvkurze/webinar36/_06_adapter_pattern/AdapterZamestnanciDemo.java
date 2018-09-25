package sk.itvkurze.webinar36._06_adapter_pattern;

import java.util.List;

public class AdapterZamestnanciDemo
{
	public static void main(String[] args)
	{
		ZamestnanecKlient klient = new ZamestnanecKlient();
		
		List<Zamestnanec> zamestnanci = klient.getZoznamZamestnancov();
		
		System.out.println(zamestnanci);
	}
}
