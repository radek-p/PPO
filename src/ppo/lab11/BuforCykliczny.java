package ppo.lab11;

public class BuforCykliczny {
    int[] tablica;
    int poczatek;
    int długość;

    public BuforCykliczny(int k) {
        tablica = new int[k];
        poczatek = 0;
        długość = 0;
    }

    public void wstawNaKoniec(int element) {
        // wstaw(5)
        // [_, _, _, 1, 2, 3, 4, 5, _, _]
        // poczatek--^, długość = 5
        //
        // __________) (__________________
        // [8, 11, 22, 1, 2, 3, 4, 5, 6, 7]
        // poczatek----^, długość = 10
        int indeks = (poczatek + długość) % tablica.length;
        tablica[indeks] = element;
        if (długość == tablica.length) {
            poczatek = (poczatek + 1) % tablica.length;
        } else {
            długość += 1;
        }
    }

    public void wstawNaKoniec(int[] t) {
        for (int element : t)
            wstawNaKoniec(element);
    }

    public int wyjmijZKońca() {
//        if (długość == 0) {
//            throw new EmptyBufferException();
//        }
        int indeks = (poczatek + długość - 1) % tablica.length;
        długość -= 1;
        return tablica[indeks];
    }

    public void wstawNaPoczatek(int element) {
        poczatek = (poczatek + tablica.length - 1) % tablica.length;
        tablica[poczatek] = element;
        if (długość < tablica.length)
            długość += 1;
    }

    public void wstawNaPoczatek(int[] t) {
        for (int i = t.length - 1; i >= 0; i--)
            wstawNaKoniec(t[i]);
    }

    public int wyjmijZPoczatku() {
//        if (długość == 0) {
//            throw new EmptyBufferException();
//        }
        int wynik = tablica[poczatek];
        długość -= 1;
        poczatek = (poczatek + 1) % tablica.length;
        return wynik;
    }

    public int długość() {
        return długość;
    }

    @Override
    public String toString() {
        String wynik = "";
        // pierwszy ma indeks: poczatek
        // wszystkich jest: długość
        for (int i = poczatek; i < poczatek + długość; i++) {
            wynik += String.format("%d, ", tablica[i % tablica.length]);
        }
        return wynik;
    }
}


