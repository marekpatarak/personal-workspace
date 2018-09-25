package sk.itvkurze.webinar23.archiv;

public class ArchivException extends RuntimeException 
{
	public ArchivException(final String sprava, final Throwable dovod) {
		super(sprava, dovod);
	}
}
