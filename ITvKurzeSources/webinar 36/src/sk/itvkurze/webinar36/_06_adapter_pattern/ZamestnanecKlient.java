package sk.itvkurze.webinar36._06_adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class ZamestnanecKlient
{
	public List<Zamestnanec> getZoznamZamestnancov()
	{
		List<Zamestnanec> zamestnanci = new ArrayList<>();
		
		Zamestnanec zamestnanecZDB = new ZamestnanecDB("0001", "Igor", "Kovac", "igor.kovac@nowhere.com");
		
		zamestnanci.add(zamestnanecZDB);
		
		// prave tu pride na rad adapter pattern
		// Zamestnanec zamestnanecLdap = new ZamestnanecLdap("1111", "Peter", "Novak", "peter.novak@gmail.com");
		// zamestnanci.add(zamestnanecLdap);
		
		ZamestnanecLdap zamestnanecLdap = new ZamestnanecLdap("1111", "Peter", "Novak", "peter.novak@gmail.com");
		zamestnanci.add(new ZamestnanecAdapterLdap(zamestnanecLdap));
		
		// potrebujeme vytvorit dalsi adapter
		ZamestnanecCSV zamestnanecCSV = new ZamestnanecCSV("4234,Jakub,Novak,jakub.novak@gmail.com");
		//zamestnanci.add(zamestnanecCSV);
		
		zamestnanci.add(new ZamestnanecAdapterCSV(zamestnanecCSV));
		
		return zamestnanci;
	}
}
