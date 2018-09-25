package sk.itvkurze.webinar36._07_bridge_pattern.objekty2;

/**
 * V ramci tohto prikladu budeme aplikovat farby na objekty s pouzitim bridge patternu
 */
public class Objekty2BridgeDemo
{
	public static void main(String[] args)
	{
		Farba modraFarba = new Modra();
		
		Objekt stvorec = new Stvorec(modraFarba);
		
		Farba cervenaFarba = new Cervena();
		
		Objekt kruh = new Kruh(cervenaFarba);
		
		stvorec.aplikujFarbu();
		
		kruh.aplikujFarbu();
		
		// povedzme ze pridame dalsiu farbu - Zelena
		// a vytvorime si zeleny kurh, vidime, ze ziadny iny kod sme nemuseli menit ...
		// mozeme pridavat dalsie lubovolne farby a objekty a neporusime uz existujucu funkcionalitu ...
		Farba zelenaFarba = new Zelena();
		Objekt zelenyKruh = new Kruh(zelenaFarba);
		zelenyKruh.aplikujFarbu();
		
		Objekt zelenyStvorec = new Stvorec(zelenaFarba);
		zelenyStvorec.aplikujFarbu();
	}
}
