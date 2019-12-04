package ppo.labDodatkowy.Odcinki;

public class OdcinkiTab extends Odcinki {
    private Odcinek[] dodaneOdcinki = new Odcinek[1];
    private int ile = 0;

    @Override
    public boolean dodaj(Odcinek dodawany) {
        // Dodanie odcinka polega na sprawdzeniu, czy już jest w
        // tablicy, a jeśli nie dostawieniu na koniec.
        if (!czyJestWZbiorze(dodawany)) {
            dodajNaKoniec(dodawany);
            return true;
        } else {
            return false;
        }
    }

    private void dodajNaKoniec(Odcinek dodawany) {
        if (dodaneOdcinki.length == ile) {
            Odcinek[] nowaDłuższa = new Odcinek[2*ile];
            for (int i = 0; i < ile; ++i) {
                nowaDłuższa[i] = dodaneOdcinki[i];
            }
            dodaneOdcinki = nowaDłuższa;
        }
        dodaneOdcinki[ile] = dodawany;
        ile += 1;
    }

    private boolean czyJestWZbiorze(Odcinek dodawany) {
        for (int i = 0; i < ile; ++i) {
            if (dodawany.czyRówny(dodaneOdcinki[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean sprawdźCzyNależy(int punkt) {
        for (int i = 0; i < ile; ++i) {
            if (dodaneOdcinki[i].czyNależy(punkt)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String wynik = "";
        wynik += "{";
        for (int i = 0; i < ile; ++i) {
            wynik += dodaneOdcinki[i];
            wynik += ", ";
        }
        wynik += "}";
        return wynik;
    }
}
