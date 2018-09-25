package sk.itvkurze.webinar34._05_prototype_pattern;

public class PrototypeDemo
{
	public static void main(String[] args)
	{
		Register register = new Register();
		Film film = (Film) register.vytvorPolozku("Film");
		film.setNazov("Navrhove vzory v Jave");
		
		System.out.println(film);
		System.out.println(film.getDlzka());
		System.out.println(film.getNazov());
		System.out.println(film.getUrl());
		
		Film dalsiFilm = (Film) register.vytvorPolozku("Film");
		dalsiFilm.setNazov("Gang of Four");
		
		System.out.println(dalsiFilm);
		System.out.println(dalsiFilm.getDlzka());
		System.out.println(dalsiFilm.getNazov());
		System.out.println(dalsiFilm.getUrl());
		
	}
}
