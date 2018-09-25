package sk.itvkurze.webinar23.archiv_po_moduloch;

public interface ArchivZmluv extends AutoCloseable
{
    int NEEXISTUJUCE_ID = 0;

    void vloz(Zmluva zmluva) throws ArchivException;

    void zmaz(Zmluva zmluva) throws ArchivException;

    Iterable<Zmluva> vyhladaj(Kriterium kriterium) throws ArchivException;
}
