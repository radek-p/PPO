package ppo.lab7;

public class Ułamek {
    private int licznik, mianownik;

    public Ułamek(int nLicznik, int nMianownik) {
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
}
