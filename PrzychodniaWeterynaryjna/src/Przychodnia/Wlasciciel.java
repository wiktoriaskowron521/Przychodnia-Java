package Przychodnia;

import java.io.Serializable;

public class Wlasciciel extends Osoba implements Cloneable, Serializable {
    // KONSTRUKOTRY
    public Wlasciciel() {}

    public Wlasciciel(String imie, String nazwisko, String pesel, String numerTelefonu) {
        super(imie, nazwisko, pesel, numerTelefonu);
    }

    // METODY
    @Override
    public String toString() {
        return super.getImie() + " " + super.getNazwisko() + "numer telefonu: " + super.getNumerTelefonu();
    }

    public boolean equals(Wlasciciel other)
    {
        return (getImie().equals(other.getImie()) && getNazwisko().equals(other.getNazwisko()));
    }
}
