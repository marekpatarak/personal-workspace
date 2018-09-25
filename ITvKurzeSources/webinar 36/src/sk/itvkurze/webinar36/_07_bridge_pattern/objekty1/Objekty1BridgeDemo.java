package sk.itvkurze.webinar36._07_bridge_pattern.objekty1;

/**
 * V ramci tohto prikladu budeme aplikovat farby na objekty bez pouzitia bridge patternu
 */
public class Objekty1BridgeDemo
{
	public static void main(String[] args)
	{
		Kruh kruh = new ModryKurh();
		
		Stvorec stvorec = new CervenyStvorec();
		
		// ak by sme chceli napr. mat objekt - zeleny stvorec, opat by sme museli pre vytvorit novu triedu, ktore dedi od 
				// triedy Stvorec a implemenovat metodu aplikuj farbu, co nie je az take idealne
				Stvorec zelenyStvorec = new ZelenyStovrec();
		
		kruh.aplikujFarbu();
		stvorec.aplikujFarbu();
		zelenyStvorec.aplikujFarbu();
	}
}
