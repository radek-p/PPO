package ppo.lab4;

import static java.lang.System.out;

public class WszystkieĆwiczenia {
    public static void main(String[] args) {
        out.println("Z1. Rozwiązywanie równania kwadratowego");
        rozwiążRównanieKwadratowe(1, 2, 0);
        wypiszKreskę();

        out.println("Z2. Sumowanie kolejnych liczb");
        out.println(sumaNPoczątkowychLiczb(10));
        wypiszKreskę();

        out.println("Z3. Obliczanie silni");
        out.println(silnia(33)); // Uwaga, wyjdzie ujemna!
        wypiszKreskę();

        out.println("Z4. Wypisywanie argumentów");
        wypiszArgumenty(args);
        wypiszKreskę();

        out.println("Z5. Odwracanie fragmentu tablicy");
        odwróćFragmentTablicy(args, 0, args.length - 1);
        wypiszArgumenty(args);
        wypiszKreskę();
    }

    public static void wypiszKreskę() {
        out.println("-".repeat(50));
    }

    public static void rozwiążRównanieKwadratowe(float A, float B, float C) {
        // Ax^2 + Bx + C = 0
        float delta = B * B - 4 * A * C;
        out.println("%fx^2 + %fx + %f = 0");
        if (A == 0) {
            out.println("Równanie liniowe");
            if (B == 0) {
                if (C == 0) {
                    out.println("x jest dowolna liczba rzeczywista.");
                } else {
                    out.println("Równanie sprzeczne.");
                }
            } else {
                float x = -C / B;
                out.println("Rozwiazanie to:");
                out.println(x);
            }
        } else {
            if (delta > 0) {
                out.println("Rozwiazania to:");
                out.println((-B - Math.sqrt(delta)) / (2 * A));
                out.println((-B + Math.sqrt(delta)) / (2 * A));
            } else if (delta == 0) {
                out.println("Rozwiazanie to:");
                out.println(-B / (2 * A));
            } else {
                out.println("Równanie nie ma rozwiazań.");
            }
        }
    }

    public static void wypiszArgumenty(String[] args) {
        // W Pythonie byłoby tak:
        // args = ["abc", "def"]
        // for napis in args:
        //     print(napis)
        for (String napis : args) {
            out.println(napis);
        }
    }

    public static <T> void odwróćFragmentTablicy(T[] tablica, int i, int j) {
        // [1, 2, 3, 4, 5, 6, 5, 4, 3, 4, 5, 6, 7, 6, 5]
        //           ^                 ^
        //           i -->         <-- j
        //              ^           ^
        //                 ^     ^
        //                    ^^ koniec
        if (i < 0) i = 0;
        if (j >= tablica.length) j = tablica.length - 1;
        while (i < j) {
            T tmp = tablica[j];
            tablica[j] = tablica[i];
            tablica[i] = tmp;
            i += 1;
            j -= 1;
        }
    }

    public static int silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i += 1) {
            wynik *= i;
        }
        return wynik;
    }

    public static int sumaNPoczątkowychLiczb(int n) {
        int wynik = 0;
        // W Pythonie byłoby tak:
        // for i in range(1, n+1):
        //     wynik += i
        for (int i = 1; i <= n; i += 1) {
            wynik += i;
        }
        return wynik;
    }

}
