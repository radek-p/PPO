package ppo.lab5;

import static java.lang.System.out;

// Importujemy dwie funkcje zdefiniowane w pliku z czwartego laboratorium:
import static ppo.lab4.WszystkieĆwiczenia.wypiszKreskę;
import static ppo.lab4.WszystkieĆwiczenia.odwróćFragmentTablicy;

public class PrzesunięcieTablicy {
    public static void main(String[] args) {
        String[] tablica = {"A", "B", "C", "D", "E"};

        out.println("Podejście 1.");
        out.println("Pierwsza wersja funkcji tworzy nową tablicę:");
        String[] przesunięta = przesuńTablicęWPrawo(tablica, 3);
        out.println("Wypisujemy nowo otworzoną tablicę:");
        wypiszTablicę(przesunięta);

        wypiszKreskę();

        out.println("Podejście 2.");
        out.println("Oryginalna na razie wygląda tak:");
        wypiszTablicę(tablica);
        out.println("Druga wersja naszej funkcji jest w stanie ją zmienić:");
        przesuńTablicęWPrawo2(tablica, 4);
        out.println("Teraz wypisze się już zmieniona:");
        wypiszTablicę(tablica);
    }

    public static void wypiszTablicę(String[] tablica) {
        out.print("[");
        for (String element : tablica) {
            out.print(element + ", ");
        }
        out.println("]");
    }

    // Funkcja ma przesuwać zadaną tablicę o k elementów w prawo.
    // {"A", "B", "C", "D", "E"}
    // {"C", "D", "E", "A", "B"}
    public static String[] przesuńTablicęWPrawo(String[] tablica, int k) {
        String[] wynik = new String[tablica.length];
        for (int i = 0; i < tablica.length; ++i) {
            wynik[(k+i) % tablica.length] = tablica[i];
        }
        return wynik;
    }

    public static void przesuńTablicęWPrawo2(String[] tablica, int k) {
        odwróćFragmentTablicy(tablica, 0, tablica.length - k - 1);
        odwróćFragmentTablicy(tablica,tablica.length - k, tablica.length - 1);
        odwróćFragmentTablicy(tablica, 0, tablica.length - 1);
    }

}
