package sk.itvkurze.webinar10;

public class RetazceUtilita {

	public static String vratPodretazecPred(String retazec, String oddelovac) {
		int pozicia = retazec.indexOf(oddelovac);

		// return pozicia >= 0 ? retazec.substring(0, pozicia) : retazec ;
		// ternarny operator

		if (pozicia >= 0) {
			return retazec.substring(0, pozicia);
		}
		return retazec;
	}

	public static String vratPodretazecZa(String retazec, String oddelovac) {
		int pozicia = retazec.indexOf(oddelovac);
		
		if(pozicia >= 0) {
			return retazec.substring()
		}
	}

	public static void main(String[] args) {

	}

}
