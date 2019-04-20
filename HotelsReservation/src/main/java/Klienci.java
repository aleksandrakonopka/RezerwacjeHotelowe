public class Klienci
{
    private int id_klient;
    private String imie, nazwisko, adres, telefon, haslo;

    public Klienci()
    {
    }

    public Klienci(int id_klient, String imie, String nazwisko, String adres, String telefon, String haslo)
    {
        this.id_klient = id_klient;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.telefon = telefon;
        this.haslo = haslo;
    }

    public String getHaslo()
    {
        return haslo;
    }

    public void setHaslo(String haslo)
    {
        this.haslo = haslo;
    }

    public int getId_klient()
    {
        return id_klient;
    }

    public void setId_klient(int id_klient)
    {
        this.id_klient = id_klient;
    }

    public String getImie()
    {
        return imie;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public String getAdres()
    {
        return adres;
    }

    public void setAdres(String adres)
    {
        this.adres = adres;
    }

    public String getTelefon()
    {
        return telefon;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    @Override
    public String toString()
    {
        return "Klienci{" +
                "id_klient=" + id_klient +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                ", haslo='" + haslo + '\'' +
                '}';
    }
}
