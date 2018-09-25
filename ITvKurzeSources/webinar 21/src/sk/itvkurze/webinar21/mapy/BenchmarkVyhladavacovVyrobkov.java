package sk.itvkurze.webinar21.mapy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BenchmarkVyhladavacovVyrobkov
{
	private static final int POCET_ITERACII = 5;
	private static final int POCET_VYROBKOV = 20_000;

	private static final List<Vyrobok> vyrobky = generujVyrobky();

	public static void main(String[] args)
	{
		spustVyhladvanie(new VyhladavacVyrobkovAkoMapa());
		spustVyhladvanie(new VyhladavacVyrobkovAkoList());
	}

	private static List<Vyrobok> generujVyrobky()
	{
		final List<Vyrobok> vyrobky = new ArrayList<>();
		final Random generatorVahy = new Random();

		for (int i = 0; i < POCET_VYROBKOV; i++)
		{
			vyrobky.add(new Vyrobok(i, "Vyrobok" + i, 10 + generatorVahy.nextInt(10)));
		}
		Collections.shuffle(vyrobky);
		Collections.shuffle(vyrobky);
		Collections.shuffle(vyrobky);

		return vyrobky;
	}

	private static void spustVyhladvanie(VyhladavacVyrobkov vyhladavacVyrobkov)
	{
		final List<Vyrobok> vyrobky = BenchmarkVyhladavacovVyrobkov.vyrobky;
		System.out.println("Spustam vyhladavanie s '" + vyhladavacVyrobkov.getClass().getSimpleName() + "' . . .");

		for (int i = 0; i < POCET_ITERACII; i++)
		{
			final long zaciatok = System.currentTimeMillis();

			for (Vyrobok vyrobok : vyrobky)
			{
				vyhladavacVyrobkov.pridajVyrobok(vyrobok);
			}

			for (Vyrobok vyrobok : vyrobky)
			{
				final Vyrobok vysledok = vyhladavacVyrobkov.vyhladajVyrobokPodla(vyrobok.getId());
				if (vysledok != vyrobok)
				{
					throw new IllegalArgumentException("Vyhladavac vratil nespravny vyrobok");
				}
			}

			final long koniec = System.currentTimeMillis();
			System.out.println((koniec - zaciatok) + "ms");
			vyhladavacVyrobkov.clear();
		}
	}
}
