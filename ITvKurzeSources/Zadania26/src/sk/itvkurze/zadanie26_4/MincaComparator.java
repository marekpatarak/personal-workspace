package sk.itvkurze.zadanie26_4;

import java.util.Comparator;

public class MincaComparator implements Comparator<Minca> {

	@Override
	public int compare(Minca o1, Minca o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getHodnota(), o2.getHodnota());
	}

}

