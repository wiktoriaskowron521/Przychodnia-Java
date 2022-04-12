package Przychodnia;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Weterynarz extends Osoba implements Comparable<Weterynarz> , Serializable {

    EnumSpecjalizacja specjalizacja;
    LocalDate dataZatrudnienia;
    int cenaWizyty;
    List<Termin> dostepneTerminy;


    public EnumSpecjalizacja getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(EnumSpecjalizacja specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public int getCenaWizyty() {
        return cenaWizyty;
    }

    public void setCenaWizyty(int cenaWizyty) {
        this.cenaWizyty = cenaWizyty;
    }

    public List<Termin> getDostepneTerminy() {
        return dostepneTerminy;
    }

    public void setDostepneTerminy(List<Termin> dostepneTerminy) {
        this.dostepneTerminy = dostepneTerminy;
    }

    // KONSTRUKTORY
    public Weterynarz() { }
    public Weterynarz(EnumSpecjalizacja specjalizacja, LocalDate dataZatrudnienia, int cenatWizyty, String imie, String nazwisko, String pesel, String numerTelefonu) {
        super(imie, nazwisko, pesel, numerTelefonu);
        setCenaWizyty(cenatWizyty);
        setDataZatrudnienia(dataZatrudnienia);
        setSpecjalizacja(specjalizacja);
    }

    //METODY
    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() +
                "specjalizacja " + specjalizacja +
                ", cenaWizyty: " + cenaWizyty;
    }

    @Override
    public int compareTo(Weterynarz other) {
        if (super.getNazwisko().compareTo(other.getNazwisko()) == 0) {
            return (super.getImie().compareTo((other.getImie())));
        }
        return super.getNazwisko().compareTo(other.getNazwisko());
    }

    public boolean equals(Weterynarz obj) {
        if (Objects.equals(getPesel(), obj.getPesel()))
            return true;
        else {
            return false;
        }
    }
/*
    public void stworzTerminarz()
    {
        // Robienie Terminarza
        dostepneTerminy = new ArrayList<Termin>();
        LocalDate data = LocalDate.now();
        //  new DateTime(DateTime.Now.Year, DateTime.Now.Month, (DateTime.Now.AddDays(2)).Day, 9, 00, 00);
        for (int i = 0; i < 6; i++) // terminarz obejmuje tydzień do przodu
        {
            data = ustawStart(data);
            for (int j = 0; j < 14; j++) // pracujemy od 9 do 16
            {
                Termin t = new Termin(data);
                dostepneTerminy.add(t);
                data = data.AddMinutes(30);
            }
            data = data.plusDays(1);
        }
    }

    public void aktualizujTermianarz()
    {
        DateTime dzis = UstawStart(DateTime.Now);
        int ileDodac = dzis.Day - DostepneTerminy[0].TerminWizyty.Day;
        for (int i = 0; i<DostepneTerminy.Count;i++)
        {
            if(DateTime.Compare(DostepneTerminy[i].TerminWizyty,dzis)<0)
            {
                DostepneTerminy.RemoveAt(i);
                i--;
            }
        }
        DateTime data = DostepneTerminy[(dostepneTerminy.Count)-1].TerminWizyty;
        data = new DateTime(data.Year, data.Month,(data.AddDays(1)).Day, 9, 00, 00);
        for (int i = 0; i < ileDodac; i++)
        {
            data = UstawStart(data) ;
            for (int j = 0; j < 14; j++) // pracujemy od 9 do 16
            {
                Termin t = new Termin(data);
                dostepneTerminy.Add(t);
                data = data.AddMinutes(30);
            }
            data = data.AddDays(1);
        }
    }

    public void aktualizujGodziny()
    {
        DateTime czas = DateTime.Now;
        for (int i = 0; i < DostepneTerminy.Count; i++)
        {
            if (DostepneTerminy[i].TerminWizyty.Year == czas.Year &&
                    DostepneTerminy[i].TerminWizyty.Month == czas.Month &&
                    DostepneTerminy[i].TerminWizyty.Day == czas.Day)
            {
                if(DostepneTerminy[i].TerminWizyty.Hour < czas.Hour)
                {
                    DostepneTerminy.RemoveAt(i);
                    i--;
                }
            }
        }
    }

    LocalDate ustawStart(LocalDate start)
    {
        if (start.DayOfWeek.ToString() == "Saturday")
        {
            start = new DateTime(start.Year, start.Month, (start.AddDays(2)).Day, 9, 00, 00);
        }
        else if (start.DayOfWeek.ToString() == "Sunday")
        {
            start = new DateTime(start.Year, start.Month, (start.AddDays(1)).Day, 9, 00, 00);
        }
        else
        {
            start = new DateTime(start.Year, start.Month, start.Day, 9, 00, 00);
        }
        return start;
    }*/
}
