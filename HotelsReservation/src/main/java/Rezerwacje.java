import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Rezerwacje
{
    private long pobyt_od;
    private long pobyt_do;
    private int kwota;
    private long data_rez;
    List<Pokoje> pokoje;
    Klienci klienci;
    Pracownicy pracownik;
    private int id_rezerwacji;
    private static int i=0;
    Platnosci platnosci;
    boolean rozliczony;

    public Rezerwacje()
    {
        pokoje = new LinkedList<Pokoje>();
        kwota = 0;
    }

    public Rezerwacje(long pobyt_od, long pobyt_do, Klienci klienci,
                      Pracownicy pracownik, int id_rezerwacji, Typy_platnosci typ)
    {
        this.pobyt_od = pobyt_od;
        this.pobyt_do = pobyt_do;
        this.kwota = 0;
        Date data = new Date();
        this.data_rez = data.getTime();
        this.klienci = klienci;
        this.pracownik = pracownik;
        this.id_rezerwacji = id_rezerwacji;
        rozliczony = false;
    }

    public boolean isRozliczony()
    {
        return rozliczony;
    }

    public void setRozliczony(boolean rozliczony)
    {
        this.rozliczony = rozliczony;
    }

    public void rozlicz()
    {
        Date data = new Date();
        long now = data.getTime();
        if(!platnosci.isDokonana())
        {
            System.out.println("Nie zapłacił!");
            return;
        }
        if(now>getPobyt_do())
        {
            System.out.println("Za wcześnie!");
            return;
        }
        for (Pokoje pokoj : pokoje)
        {
            pokoj.setDostepny(true);
        }
        this.setRozliczony(true);
    }

    public Platnosci getPlatnosci()
    {
        return platnosci;
    }

    public void setPlatnosci(Typy_platnosci typ)
    {
        i++;
        long dni = pobyt_do-pobyt_od;
        int przel = ((int)dni)/(1000*60*60*24);
        kwota=(kwota*przel);
        this.platnosci =  new Platnosci(i,typ,this.kwota);
    }


    public void setPokoje(List<Pokoje> pokoje)
    {
        this.pokoje = pokoje;
        boolean correct=true;
        for(Pokoje pok:pokoje)
        {
            if(!pok.isDostepny())
            {
                correct = false;
            }
        }
        if(correct)
        {
            for(Pokoje pokoj:pokoje)
            {
                pokoj.setDostepny(false);
                kwota+=pokoj.getCena();
            }
        }
    }

    public Klienci getKlienci()
    {
        return klienci;
    }

    public void setKlienci(Klienci klienci)
    {
        this.klienci = klienci;
    }

    public Pracownicy getPracownik()
    {
        return pracownik;
    }

    public void setPracownik(Pracownicy pracownik)
    {
        this.pracownik = pracownik;
    }

    public long getPobyt_od()
    {
        return pobyt_od;
    }

    public void setPobyt_od(long pobyt_od)
    {
        this.pobyt_od = pobyt_od;
    }

    public long getPobyt_do()
    {
        return pobyt_do;
    }

    public void setPobyt_do(long pobyt_do)
    {
        this.pobyt_do = pobyt_do;
    }

    public void setData_rez(long data_rez)
    {
        this.data_rez = data_rez;
    }

    public float getKwota()
    {
        return kwota;
    }

    public void setKwota(int kwota)
    {
        this.kwota = kwota;
    }

    public long getData_rez()
    {
        return data_rez;
    }

    public List<Pokoje> getPokoje()
    {
        return pokoje;
    }

    public void addPokoje(Pokoje pokoj)
    {
        if(pokoj.isDostepny())
        {
            pokoj.setDostepny(false);
            pokoje.add(pokoj);
            kwota+=pokoj.getCena();
        }
        else
        {
            System.out.println("Błąd!");
        }
    }

    public int getId_rezerwacji()
    {
        return id_rezerwacji;
    }

    public void setId_rezerwacji(int id_rezerwacji)
    {
        this.id_rezerwacji = id_rezerwacji;
    }

    @Override
    public String toString()
    {
        Date data1 = new Date(pobyt_od);
        Date data2 = new Date(pobyt_do);
        Date data3 = new Date(data_rez);
        return "Rezerwacje{" +
                "pobyt_od=" + data1 +
                ", pobyt_do=" + data2 +
                ", kwota=" + kwota +
                ", data_rez=" + data3 +
                ", pokoje=" + pokoje +
                ", klienci=" + klienci +
                ", pracownik=" + pracownik +
                ", id_rezerwacji=" + id_rezerwacji +
                ", platności=" + platnosci +
                '}';
    }
}
