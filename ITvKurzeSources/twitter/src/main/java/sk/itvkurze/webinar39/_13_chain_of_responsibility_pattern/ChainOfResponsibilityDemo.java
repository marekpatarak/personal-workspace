package sk.itvkurze.webinar39._13_chain_of_responsibility_pattern;

public class ChainOfResponsibilityDemo
{
	public static void main(String[] args)
	{
		Riaditel peter_kovac = new Riaditel();
		ProjektovyManazer emil_horvath = new ProjektovyManazer();
		CEO janka_kratka = new CEO();
		
		peter_kovac.setSchvalovatel(emil_horvath);
		emil_horvath.setSchvalovatel(janka_kratka);
		
		Ziadost ziadost = new Ziadost(ZiadostTyp.KONFERENCIA, 500);
		peter_kovac.spracujZiadost(ziadost);
		
		ziadost = new Ziadost(ZiadostTyp.TEAMBUILDING, 2000);
		peter_kovac.spracujZiadost(ziadost);
		
		ziadost = new Ziadost(ZiadostTyp.BENEFITPLUS, 3000);
		peter_kovac.spracujZiadost(ziadost);
	}
}
