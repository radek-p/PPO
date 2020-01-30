package ppo.lab13;

import java.util.Scanner;

public class TestKolejki {
    public static void przykład1() {
        // "abc", "cde", "efg"
        Kolejka<String> k = new Kolejka<>();
        k.wstawElementNaKoniec("abc");
        k.wstawElementNaKoniec("cde");
        k.wstawElementNaKoniec("efg");
    }

    public static void przykład2() {
        Scanner s = new Scanner(System.in);
        Kolejka<String> k = new Kolejka<>(); // PIERWSZA MODYFIKACJA
        String polecenie = "";
        while (!polecenie.equals("koniec")) {
            System.out.println(k);
            polecenie = s.nextLine();
            switch (polecenie) {
                case "wstaw": {
                    k.wstawElementNaKoniec(s.nextLine());
                    break;
                }
                case "wyjmij": {
                    try {
                        System.out.println(k.pobierzElementZPoczatku());
                    } catch (PustaKolejka pustaKolejka) {
                        System.out.println("Kolejka jest pusta!");
                    }
                    break;
                }
                default: {
                    System.out.println("Nieznane polecenie!");
                }
            }
        }
    }

    public static void main(String[] args) {
//        przykład1();
        przykład2();
    }
}
