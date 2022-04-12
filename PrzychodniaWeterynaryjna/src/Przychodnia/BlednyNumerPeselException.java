package Przychodnia;

public class BlednyNumerPeselException extends Exception {
    public BlednyNumerPeselException()
    {
        super(String.format("Podano zły numer pesel."));
    }
}
