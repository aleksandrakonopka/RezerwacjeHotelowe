import java.util.Date;

public class Platnosci
{
    private int id_platnosci;
    private Typy_platnosci platnosc;
    private int kwota;
    private long time;
    private boolean dokonana;

    public Platnosci()
    {
    }

    public Platnosci(int id_platnosci, Typy_platnosci platnosc, int kwota)
    {
        this.id_platnosci = id_platnosci;
        this.platnosc = platnosc;
        this.kwota = kwota;
        Date data = new Date();
        this.time = data.getTime();
        dokonana = false;
    }

    public boolean isDokonana()
    {
        return dokonana;
    }

    public void setDokonana(boolean dokonana)
    {
        this.dokonana = dokonana;
        this.time = getTime();
    }

    public int getId_platnosci()
    {
        return id_platnosci;
    }

    public void setId_platnosci(int id_platnosci)
    {
        this.id_platnosci = id_platnosci;
    }

    public Typy_platnosci getPlatnosc()
    {
        return platnosc;
    }

    public void setPlatnosc(Typy_platnosci platnosc)
    {
        this.platnosc = platnosc;
    }

    public int getKwota()
    {
        return kwota;
    }

    public void setKwota(int kwota)
    {
        this.kwota = kwota;
    }

    public long getTime()
    {
        return time;
    }

    public void setTime(long time)
    {
        this.time = time;
    }


    @Override
    public String toString()
    {
        Date data1 = new Date(time);
        return "Platnosci{" +
                "id_platnosci=" + id_platnosci +
                ", platnosc=" + platnosc +
                ", kwota=" + data1 +
                ", time=" + time +
                ", dokonana=" + dokonana +
                '}';
    }
}
