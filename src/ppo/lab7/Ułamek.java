package ppo.lab7;

public class Ułamek {
    private int licznik, mianownik;

    public Ułamek(int nLicznik, int nMianownik) {
        if (nMianownik == 0) {
            throw new RuntimeException("Division by 0");
        }
        licznik = nLicznik;
        mianownik = nMianownik;

        int M = NWD(licznik, mianownik);
        licznik /= M;
        mianownik /= M;

        if (mianownik < 0) {
            mianownik *= -1;
            licznik *= -1;
        }
    }

    public String toString() {
        return String.format("(%d/%d)", licznik, mianownik);
    }

    private static int NWD(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public Ułamek dodaj(Ułamek u2) {
        return new Ułamek(
                licznik * u2.mianownik + u2.licznik * mianownik,
                mianownik * u2.mianownik
        );
    }

    public Ułamek odejmij(Ułamek u2) {
        return new Ułamek(
                licznik * u2.mianownik - u2.licznik * mianownik,
                mianownik * u2.mianownik
        );
    }

    public Ułamek pomnóż(Ułamek u2) {
        return new Ułamek(
                licznik * u2.licznik,
                mianownik * u2.mianownik
        );
    }

    public Ułamek podziel(Ułamek u2) {
        if (u2.licznik == 0) {
            throw new RuntimeException("Division by 0");
        }
        return new Ułamek(
                licznik * u2.mianownik,
                mianownik * u2.licznik
        );
    }
}
