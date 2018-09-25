package sk.itvkurze.webinar23.archiv_po_moduloch;

public class Kriterium
{
    private String klient;
    private int prinajmensomOdpracovanychHodin;

    public Kriterium client(final String klient)
    {
        this.klient = klient;

        return this;
    }

    public Kriterium prinajmensomOdpracovanychHodin(final int prinajmensomOdpracovanychHodin)
    {
        this.prinajmensomOdpracovanychHodin = prinajmensomOdpracovanychHodin;

        return this;
    }

    public String getKlient()
    {
        return klient;
    }

    public int getPrinajmensomOdpracovanychHodin()
    {
        return prinajmensomOdpracovanychHodin;
    }

    @Override
    public String toString()
    {
        return "Kriterium{" +
                "klient='" + klient + '\'' +
                ", prinajmensomOdpracovanychHodin=" + prinajmensomOdpracovanychHodin +
                '}';
    }
}
