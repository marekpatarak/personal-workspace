package sk.itvkurze.webinar21.mapy;

public interface VyhladavacVyrobkov {

	Vyrobok vyhladajVyrobokPodla(final int id);

	void pridajVyrobok(final Vyrobok vyrobok);
	
	void clear();
}
