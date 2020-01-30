package ppo.lab15.Indekser;

import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Indekser {
    private Map<String, Set<Integer>> indeks;

    Indekser() {
        indeks = new TreeMap<>();
    }

    public void indeksuj(String nazwaPliku) {
        try {
            Scanner s = new Scanner(new File(nazwaPliku));
            indeksuj(s);
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }
    }

    public void indeksuj(Scanner s) {
        int numerLinii = 1;
        while (s.hasNextLine()) {
            String linia = s.nextLine();
            Scanner s2 = new Scanner(linia);
            s2.useDelimiter("[^abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+");
            while (s2.hasNext()) {
                String słowo = s2.next();
                uaktualnijIndeks(numerLinii, słowo);
            }
            numerLinii += 1;
        }
    }

    private void uaktualnijIndeks(int numerLinii, String słowo) {
        // upewnij się, że słowo jest już w indeksie i ma swój zbiór linii
        if (!indeks.containsKey(słowo)) {
            indeks.put(słowo, new TreeSet<>());
        }
        indeks.get(słowo).add(numerLinii);
    }

    @Override
    public String toString() {
        return indeks.toString();
    }
}
