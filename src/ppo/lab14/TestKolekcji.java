package ppo.lab14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestKolekcji {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Zła liczba argumentów.");
            return;
        }

        System.out.println(args[0]);
        System.out.println(args[1]);

        Collection<String> linie1 = null, linie2 = null;
        try {
            linie1 = wczytajLinie(args[0]);
            linie2 = wczytajLinie(args[1]);
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie został znaleziony!");
            return;
        }

        wypiszWspólneLinie(linie1, linie2);
    }

    private static void wypiszWspólneLinie(Collection<String> linie1, Collection<String> linie2) {
        for (String linia : linie1) {
            if (linie2.contains(linia))
                System.out.println(linia);
//            boolean czyJestWDrugimPliku = false;
//            for (String linia2 : linie2) {
//                if (linia.equals(linia2))
//                    czyJestWDrugimPliku = true;
//            }
//            System.out.println(linia);
        }
    }

    private static Collection<String> wczytajLinie(String nazwaPliku) throws FileNotFoundException {
        Scanner s = new Scanner(new File(nazwaPliku));
        Collection<String> wynik = new ArrayList<>();

        // dodaj wszystkie linie
        while (s.hasNextLine())
            wynik.add(s.nextLine());

        return wynik;
    }
}
