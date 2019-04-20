public enum Typy_platnosci
{
    GOTOWKA(true), KARTA(true);

    boolean dostepny;

    Typy_platnosci(boolean dostepny)
    {
        this.dostepny = dostepny;
    }

    public boolean isDostepny()
    {
        return dostepny;
    }

    public void setDostepny(boolean dostepny)
    {
        this.dostepny = dostepny;
    }
}
