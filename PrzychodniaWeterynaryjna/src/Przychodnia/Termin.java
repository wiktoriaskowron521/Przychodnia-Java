package Przychodnia;

import java.io.Serializable;
import java.time.LocalDate;

public class Termin  implements Serializable {
    LocalDate terminWIzyty;

    public LocalDate getTerminWIzyty() {
        return terminWIzyty;
    }

    public void setTerminWIzyty(LocalDate terminWIzyty) {
        this.terminWIzyty = terminWIzyty;
    }
    public Termin(){}
    public Termin(LocalDate termin)
    {
        setTerminWIzyty(termin);
    }

    @Override
    public String toString() {
        return terminWIzyty.toString();
    }
}
