package sk.itvkurze.webinar23.archiv_po_moduloch.databaza;

import java.sql.*;

import sk.itvkurze.webinar23.archiv_po_moduloch.Zmluva;
import sk.itvkurze.webinar23.archiv_po_moduloch.ArchivZmluv;
import sk.itvkurze.webinar23.archiv_po_moduloch.Kriterium;
import sk.itvkurze.webinar23.archiv_po_moduloch.ArchivException;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class DatabazaArchivZmluv implements ArchivZmluv
{
    private Connection spojenie;

    private final PreparedStatement prikazVloz;
    private final PreparedStatement prikazZmaz;

    public DatabazaArchivZmluv(final Connection spojenie)
    {
        this.spojenie = spojenie;

        try
        {
            spojenie.createStatement().executeUpdate(
                    "CREATE TABLE IF NOT EXISTS " +
                        "klient_zmluvy (" +
                        "id INT IDENTITY," +
                        "klient VARCHAR(15) NOT NULL," +
                        "odpracovaneHodiny INT NOT NULL" +
                        ")");

            prikazVloz = spojenie.prepareStatement(
                    "INSERT INTO klient_zmluvy (klient, odpracovaneHodiny) VALUES (?, ?)",
                    RETURN_GENERATED_KEYS);

            prikazZmaz = spojenie.prepareStatement("delete from klient_zmluvy where id = ?");
        }
        catch (SQLException e)
        {
            throw new ArchivException("Nie je mozne inicializovat archiv", e);
        }
    }

    @Override
    public void vloz(final Zmluva zmluva) throws ArchivException
    {
        try
        {
            prikazVloz.setString(1, zmluva.getKlient());
            prikazVloz.setInt(2, zmluva.getOdpracovaneHodiny());
            prikazVloz.executeUpdate();

            final ResultSet keys = prikazVloz.getGeneratedKeys();
            if (keys.next())
            {
                final int id = keys.getInt("id");
                zmluva.setId(id);
            }
        }
        catch (SQLException e)
        {
            throw new ArchivException("Nie je mozne vlozit: " + zmluva, e);
        }
    }

    @Override
    public void zmaz(final Zmluva zmluva) throws ArchivException
    {
        try
        {
            prikazZmaz.setInt(1, zmluva.getId());
            if (prikazZmaz.executeUpdate() > 0)
            {
                zmluva.setId(NEEXISTUJUCE_ID);
            }
        }
        catch (SQLException e)
        {
            throw new ArchivException("Nie je mozne zmazat: " + zmluva, e);
        }
    }

    @Override
    public Iterable<Zmluva> vyhladaj(final Kriterium kriterium) throws ArchivException
    {
        try
        {
            final Statement statement = spojenie.createStatement();
            final ResultSet resultSet = statement.executeQuery(
                    "SELECT * " +
                        "FROM  klient_zmluvy " +
                        "WHERE " + vygenerujKlauzuluWhere(kriterium));

            return new DatabazaIterable(resultSet);
        }
        catch (SQLException e)
        {
            throw new ArchivException("Nie je mozne vyhladat data podla kriteria: " + kriterium, e);
        }
    }

    private String vygenerujKlauzuluWhere(final Kriterium kriterium)
    {
        final StringBuilder builder = new StringBuilder();

        final boolean obsahujeKriteriumKlienta = kriterium.getKlient() != null;
        if (obsahujeKriteriumKlienta)
        {
            builder.append("klient = '")
                   .append(kriterium.getKlient())
                   .append("'");
        }

        final boolean obsahujeKriteriumOdpracovaneHodiny = kriterium.getPrinajmensomOdpracovanychHodin() > 0;
        if (obsahujeKriteriumOdpracovaneHodiny)
        {
            if (obsahujeKriteriumKlienta)
            {
                builder.append(" AND ");
            }

            builder.append(" odpracovaneHodiny > ")
                   .append(kriterium.getPrinajmensomOdpracovanychHodin());
        }

        if (!obsahujeKriteriumKlienta && !obsahujeKriteriumOdpracovaneHodiny)
        {
            return "true";
        }

        return builder.toString();
    }

    @Override
    public void close() throws ArchivException
    {
        try
        {
            spojenie.close();
        }
        catch (SQLException e)
        {
            throw new ArchivException("Chyba pri zatvarani databazoveho spojenia", e);
        }
    }
}
