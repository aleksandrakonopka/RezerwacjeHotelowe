public class Pracownicy
{

    private String imie, nazwisko;
    private int id_pracownicy;
    private String haslo;

    public Pracownicy(String imie, String nazwisko, int id_pracownicy, String haslo)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_pracownicy = id_pracownicy;
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

    public int getId_pracownicy()
    {
        return id_pracownicy;
    }

    public void setId_pracownicy(int id_pracownicy)
    {
        this.id_pracownicy = id_pracownicy;
    }

    @Override
    public String toString()
    {
        return "Pracownicy{" +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id_pracownicy=" + id_pracownicy +
                ", haslo='" + haslo + '\'' +
                '}';
    }
}
