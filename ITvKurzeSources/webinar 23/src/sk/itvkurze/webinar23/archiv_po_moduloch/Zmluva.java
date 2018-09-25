package sk.itvkurze.webinar23.archiv_po_moduloch;

public class Zmluva
{

    private int id;
    private final String klient;
    private final int odpracovaneHodiny;

    public Zmluva(final String klient, final int odpracovaneHodiny)
    {
        this.klient = klient;
        this.odpracovaneHodiny = odpracovaneHodiny;
    }

    public String getKlient()
    {
        return klient;
    }

    public int getOdpracovaneHodiny()
    {
        return odpracovaneHodiny;
    }

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Zmluva{" +
                "id=" + id +
                ", klient='" + klient + '\'' +
                ", odpracovaneHodiny=" + odpracovaneHodiny +
                '}';
    }
}
