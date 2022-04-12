package Przychodnia;

public class BlednyNumerTelException extends Exception {
    public BlednyNumerTelException() {
        super(String.format("Podano błędny numer telefonu."));
    }
}