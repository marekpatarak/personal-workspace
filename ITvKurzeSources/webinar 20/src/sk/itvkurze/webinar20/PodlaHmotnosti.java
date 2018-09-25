package sk.itvkurze.webinar20;

import java.util.Comparator;

public class PodlaHmotnosti implements Comparator<Vyrobok> {

	@Override
	public int compare(Vyrobok o1, Vyrobok o2) {
		return Integer.compare(o1.getVaha(), o2.getVaha());
	}
}
