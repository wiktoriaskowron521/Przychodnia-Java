package Przychodnia;

import java.io.Serializable;
import java.util.Objects;

public class Pacjent extends Zwierze implements Comparable<Pacjent>, Serializable {

    private static int aktualneID = 0;
    private int id;
    private Wlasciciel wlasciciel;

    public static int getAktualneID() {
        return aktualneID;
    }

    public static void setAktualneID(int aktualneID) {
        Pacjent.aktualneID = aktualneID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Wlasciciel getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(Wlasciciel wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    // KONSTRUKTORY
    public Pacjent(){}

    public Pacjent(int id, Wlasciciel wlasciciel,String gatunek, int wiek, String imie) {
        super(gatunek, wiek, imie);
        aktualneID++;
        setWlasciciel(wlasciciel);
        setId(id);
    }

    // METODY
    @Override
    public String toString() {
        return "id:" + getId() + super.getImie() + " gatunek: " + super.getGatunek() + " wlasciciel: " + getWlasciciel().toString();
    }
    @Override
    public int compareTo(Pacjent other) {
        return  getId().compareTo(other.getId());
    }

    public boolean equals(Pacjent obj) {
        return (getId().equals(obj.getId())
                && getGatunek().Equals(obj.getGatunek())
                && getWlasciciel().Equals(obj.getWlasciciel()));
    }
}
