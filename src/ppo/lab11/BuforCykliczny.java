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

    int wyjmijZKońca() {
        if (długość == 0) {
            throw new IllegalArgumentException("Empty buffer!");
        }
        int indeks = (poczatek + długość - 1) % tablica.length;
        długość -= 1;
        return tablica[indeks];
    }
}


