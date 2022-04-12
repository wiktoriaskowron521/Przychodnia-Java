package Przychodnia;

import java.io.Serializable;

public class Wizyta implements Serializable {
    private Weterynarz weterynarz;
    private Pacjent pacjent;
    private Termin terminWizyty;
    private String zabieg;
    private String diagnoza;

    public Weterynarz getWeterynarz() {
        return weterynarz;
    }

    public void setWeterynarz(Weterynarz weterynarz) {
        this.weterynarz = weterynarz;
    }

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    public Termin getTerminWizyty() {
        return terminWizyty;
    }

    public void setTerminWizyty(Termin terminWizyty) {
        this.terminWizyty = terminWizyty;
    }

    public String getZabieg() {
        return zabieg;
    }

    public void setZabieg(String zabieg) {
        this.zabieg = zabieg;
    }

    public String getDiagnoza() {
        return diagnoza;
    }

    public void setDiagnoza(String diagnoza) {
        this.diagnoza = diagnoza;
    }

    // KONSTRUKTORY
    public Wizyta(){}

    // METODY
    @Override
    public String toString() {
        return "pacjent: "  + "\nweterynarz:"
                + "\ntermin wizyty: " + getTerminWizyty()
                + "\ndiagnoza: " + getDiagnoza()
                + "\nzabiegi: "+ getZabieg();
    }
    public boolean equals(Wizyta other)
    {
        return (getPacjent().equals(other.getPacjent())
                && getWeterynarz().equals(other.getWeterynarz()));
    }
}
