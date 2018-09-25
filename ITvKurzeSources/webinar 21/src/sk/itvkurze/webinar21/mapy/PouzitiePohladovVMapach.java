package sk.itvkurze.webinar21.mapy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.CORBA.IDLTypeOperations;

public class PouzitiePohladovVMapach
{
	public static void main(String[] args)
	{
		final Map<Integer, Vyrobok> idNaVyrobok = new HashMap<>();
		idNaVyrobok.put(1, Inventar.dvere);
		idNaVyrobok.put(2, Inventar.okno);
		idNaVyrobok.put(3, Inventar.stol);

		System.out.println(idNaVyrobok);
		System.out.println();

		// zoznam klucov
		final Set<Integer> idecka = idNaVyrobok.keySet();
		System.out.println(idecka);

		idecka.remove(1);
		System.out.println(idecka);
		System.out.println(idNaVyrobok);
		System.out.println();

		// idecka.add(4); // dostaneme chybu, nakolko nie su ziadne data asociovane s
		// tymto klucom ... :-)

		final Collection<Vyrobok> vyrobky = idNaVyrobok.values();
		System.out.println(vyrobky);
		System.out.println();

		vyrobky.remove(Inventar.okno);
		System.out.println(vyrobky);
		System.out.println(idNaVyrobok);
		System.out.println();

		// vyrobky.add(Inventar.okno);

		// entrySet
		final Set<Entry<Integer, Vyrobok>> zaznamy = idNaVyrobok.entrySet();

		for (Entry<Integer, Vyrobok> zaznam : zaznamy)
		{
			System.out.println(zaznam.getKey() + " -> " + zaznam.getValue());
			zaznam.setValue(Inventar.okno);
		}

		System.out.println(idNaVyrobok);
	}
}
