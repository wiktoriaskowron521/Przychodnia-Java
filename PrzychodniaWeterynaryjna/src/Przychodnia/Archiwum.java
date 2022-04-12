package Przychodnia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Archiwum implements Serializable {
    List<Wizyta> archiwumWizyt;

    public List<Wizyta> getArchiwumWizyt() {
        return archiwumWizyt;
    }

    public void setArchiwumWizyt(List<Wizyta> archiwumWizyt) {
        this.archiwumWizyt = archiwumWizyt;
    }

    public Archiwum()
    {
        archiwumWizyt = new ArrayList<Wizyta>();
    }
    /// <summary>
    /// Metoda dodająca wizytę, która już się odbyla do listy archiwumWizyt.
    /// </summary>
    /// <param name="w"></param>
    public void dodajWizyte(Wizyta w)
    {
        archiwumWizyt.add(w);
    }
}
