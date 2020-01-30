package ppo.lab13;

public class Kolejka<T> {
    public class ElementKolejki {
        final T wartość;
        public ElementKolejki następny = null;

        public ElementKolejki(T wartość) {
            this.wartość = wartość;
        }
    }

    ElementKolejki pierwszy = null, ostatni = null;

    boolean czyPusta() {
        return pierwszy == null;
    }

    public void wstawElementNaKoniec(T element) {
        ElementKolejki nowyOstatni = new ElementKolejki(element);

        if (czyPusta()) {
            pierwszy = ostatni = nowyOstatni;
        } else {
            ostatni.następny = nowyOstatni;
            ostatni = nowyOstatni;
        }
    }

    public T pobierzElementZPoczatku() throws PustaKolejka {
        if (czyPusta()) {
            throw new PustaKolejka();
        }

        T doZwrócenia = pierwszy.wartość;
        pierwszy = pierwszy.następny;

        return doZwrócenia;
    }

    @Override
    public String toString() {
        String wynik = "";

        ElementKolejki obecny = pierwszy;
        while (obecny != null) {
            wynik += obecny.wartość.toString() + ", ";
            obecny = obecny.następny;
        }
        return wynik;
    }
}
