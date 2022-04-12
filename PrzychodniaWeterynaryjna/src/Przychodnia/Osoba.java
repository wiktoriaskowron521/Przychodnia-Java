package Przychodnia;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String numerTelefonu;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) throws BlednyNumerPeselException {
        if (SprawdzPesel(pesel))
        {
            this.pesel = pesel;
            return;
        }
        throw new BlednyNumerPeselException();
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) throws BlednyNumerTelException {
        if (SprawdzNrTelefonu(numerTelefonu))
        {
            this.numerTelefonu = numerTelefonu;
            return;
        }
        throw new BlednyNumerTelException();
    }

    // KONSTRUKOTRY

    public Osoba(){}

    public Osoba(String imie, String nazwisko, String pesel, String numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.numerTelefonu = numerTelefonu;
    }

    // METODY
    public boolean SprawdzPesel(String pesel)
    {
        return pesel.matches("^\\d{11}$");
    }
    public boolean SprawdzNrTelefonu(String nrTelefonu)
    {
        if(nrTelefonu.matches("^\\d{3}-\\d{3}-\\d{3}$")){
            return nrTelefonu.matches("^\\d{3}-\\d{3}-\\d{3}$");
        } else {
            return nrTelefonu.matches("^\\d{9}$");
        }
    }
}
