import java.util.LinkedList;
import java.util.List;

public enum Pokoje
{
    POKOJ_1(1),
    POKOJ_2(1),
    POKOJ_3(1),
    POKOJ_4(2),
    POKOJ_5(2),
    POKOJ_6(2),
    POKOJ_7(3),
    POKOJ_8(3),
    POKOJ_9(4),
    POKOJ_10(4);

    private float cena;
    private int osob;
    boolean dostepny;
    List<Udogodnienia> udogodnienia;
    Pokoje()
    {
        udogodnienia = new LinkedList<Udogodnienia>();
    }

    Pokoje(int osob)
    {
        udogodnienia = new LinkedList<Udogodnienia>();
        this.osob=osob;
        cena=100+osob*50;
        dostepny = true;
    }

    public boolean isDostepny()
    {
        return dostepny;
    }

    public void setDostepny(boolean dostepny)
    {
        this.dostepny = dostepny;
    }

    public float getCena()
    {
        return cena;
    }

    public void setCena(float cena)
    {
        this.cena = cena;
    }

    public int getOsob()
    {
        return osob;
    }

    public void setOsob(int osob)
    {
        this.osob = osob;
    }

    public List<Udogodnienia> getUdogodnienia()
    {
        return udogodnienia;
    }

    public void addUdogodnienie(Udogodnienia udogodnienie)
    {
        udogodnienia.add(udogodnienie);
        cena+=25;
    }

    public void delUdogodnienie(Udogodnienia udogodnienie)
    {
        udogodnienia.remove(udogodnienie);
        cena-=25;
    }

    public void setUdogodnienia(List<Udogodnienia> udogodnienia)
    {
        this.udogodnienia = new LinkedList<Udogodnienia>();
        this.udogodnienia = udogodnienia;
        int ile = udogodnienia.size();
        cena+=(ile*25);
    }

    @Override
    public String toString()
    {
        return "Pokoje{" +
                "cena=" + cena +
                ", osob=" + osob +
                ", dostepny=" + dostepny +
                ", udogodnienia=" + udogodnienia +
                '}';
    }
}
