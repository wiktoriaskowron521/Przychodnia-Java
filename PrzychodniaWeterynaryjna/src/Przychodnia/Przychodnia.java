package Przychodnia;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Przychodnia implements Serializable {
    List<Weterynarz> weterynarze;
    List<Pacjent> pacjenci;
    List<Wizyta> aktualneWizyty;

    public List<Weterynarz> getWeterynarze() {
        return weterynarze;
    }

    public void setWeterynarze(List<Weterynarz> weterynarze) {
        this.weterynarze = weterynarze;
    }

    public List<Pacjent> getPacjenci() {
        return pacjenci;
    }

    public void setPacjenci(List<Pacjent> pacjenci) {
        this.pacjenci = pacjenci;
    }

    public List<Wizyta> getAktualneWizyty() {
        return aktualneWizyty;
    }

    public void setAktualneWizyty(List<Wizyta> aktualneWizyty) {
        this.aktualneWizyty = aktualneWizyty;
    }

    // KONSTRUKTORY
    public Przychodnia()
    {
        weterynarze = new ArrayList<Weterynarz>();
        pacjenci = new ArrayList<Pacjent>();
        aktualneWizyty = new ArrayList<Wizyta>();
    }
    public void dodajWeterynarza(Weterynarz wet)
    {
        // sprawdzenie czy nie ma już takiego lekarza
        for (Weterynarz w : weterynarze) {
            if(w.equals(wet)){
                System.out.println("Taki lekarz już istnieje");
            }
        }
        // dodanie lekarza
        weterynarze.add(wet);
    }

    public void usunWeterynarzaPesel(String PESEL)
    {
        for (int i = 0; i < weterynarze.size(); i++)
        {
            if (Objects.equals(weterynarze.get(i).getPesel(), PESEL))
                weterynarze.remove(i);
        }
    }
    
    public void sortujWeterynarzy(){
        Collections.sort(weterynarze);
    }

    public void dodajPacjenta(Pacjent p)
    {
        // sprawdzenie czy nie ma już takiego pacjenta
        for (Pacjent pacjent : pacjenci) {
            if(pacjent.equals(p)){
                System.out.println("Taki pacjent już istnieje");
            }
        }
        pacjenci.add(p);
    }

    public void UsunPacjenta(Pacjent p)
    {
        pacjenci.remove(p);
    }

    public void UsunWizyte(Wizyta w)
    {
        aktualneWizyty.remove(w);
    }

    public void Archiwizuj(Archiwum archiwum)
    {

        LocalDate dzis = LocalDate.now();
        int ile = aktualneWizyty.size();
        for (int i = ile - 1; i >= 0; i--)
        {
            /*DateTime dzis = DateTime.Now;
            int ile = AktualneWizyty.Count;
            for (int i = ile - 1; i >= 0; i--)
            {
                if (DateTime.Compare(AktualneWizyty[i].TerminWizyty.TerminWizyty, dzis) < 0)
                // <0 - wizyta.Data jest wcześniej niż dzisiejsza data
                {
                    // archiwizowanie + klonowanie
                    archiwum.DodajWizyte(AktualneWizyty[i].Clone() as Wizyta);
                    // usuwanie z dostępnych wizyt
                    AktualneWizyty.Remove(AktualneWizyty[i]);
                }
            }*/
        }
    }
    public void archiwizujWizyte(Wizyta w, Archiwum ar)
    {
        ar.dodajWizyte(w);
        // usuwanie z dostępnych wizyt
        aktualneWizyty.remove(w);
    }

    // SERIALIZACJA
    public void save(String filePath) throws IOException {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outputStream.writeObject(this);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // DESERIALIZACJA
    public static Przychodnia load(String filePath) throws IOException {
        Przychodnia przychodnia = null;
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            try {
                przychodnia = (Przychodnia) in.readObject();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return przychodnia;
    }
}
