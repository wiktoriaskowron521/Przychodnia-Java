package Przychodnia;

public class Program{
   public static void main(String[] args) throws IOException {
        Przychodnia przychodnia = new Przychodnia();
        Archiwum archiwum = new Archiwum();
        tworzenieBazyDanych(przychodnia,archiwum);
        // Serializacja
        przychodnia.save("przychodnia.bin");
    }
    public static void tworzenieBazyDanych(Przychodnia przychodnia, Archiwum archiwum)
    {
        // swtorzenie pacjentow
        Pacjent p1 = new Pacjent(new Wlasciciel("Jan", "Kowalski", "09465656765","888999890"),"pies",2,"max");
        Pacjent p2 = new Pacjent(new Wlasciciel("Ewa", "Nowak", "45645345675","444535674"),"kot",5,"filemon");
        Pacjent p3 = new Pacjent(new Wlasciciel("Julia", "Kwiat", "01234543254","223456765"),"papuga",1,"riko");
        Pacjent p4 = new Pacjent(new Wlasciciel("Karol", "Bak", "45345656789","334256765"),"lis",4,"felix");
        Pacjent p5 = new Pacjent(new Wlasciciel("Ewelina", "Nowak", "09898734531","55676645"),"pies",7,"perelka");
        przychodnia.dodajPacjenta(p1);
        przychodnia.dodajPacjenta(p2);
        przychodnia.dodajPacjenta(p3);
        przychodnia.dodajPacjenta(p4);
        przychodnia.dodajPacjenta(p5);
        // stworzenie weterynarzy
        Weterynarz w1 = new Weterynarz(EnumSpecjalizacja.chirurg, LocalDate.now(),230,"Jan","Ruszil","54532343456","776665678");
        // NIE UMIEM PODAC DATY
        przychodnia.dodajWeterynarza(w1);
        Weterynarz w2 = new Weterynarz(EnumSpecjalizacja.kardiolog, LocalDate.now(),130,"Iwona","Skalna","21213454534","554345678");
        przychodnia.dodajWeterynarza(w2);
        Weterynarz w3 = new Weterynarz(EnumSpecjalizacja.ortopeda, LocalDate.now(),250,"Tomasz","Duda","43434343232","555676545");
        przychodnia.dodajWeterynarza(w3);
        Weterynarz w4 = new Weterynarz(EnumSpecjalizacja.internista, LocalDate.now(),100,"Jerzy","Wieronski","09085406878","985767876");
        przychodnia.dodajWeterynarza(w4);
    }
    public static void testy(Przychodnia przychodnia, Archiwum archiwum){
        

    }
}
