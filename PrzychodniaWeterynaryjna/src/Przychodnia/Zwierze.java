package Przychodnia;

import java.io.Serializable;

public abstract class Zwierze implements Serializable {
    private String gatunek;
    private int wiek;
    private String imie;

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    // KONSTRUTORY
    public Zwierze(){}

    public Zwierze(String gatunek, int wiek)
    {
        this.gatunek = gatunek;
        this.wiek = wiek;
    }
    public Zwierze(String gatunek, int wiek, String imie) {
        this.gatunek = gatunek;
        this.wiek = wiek;
        this.imie = imie;
    }
}
