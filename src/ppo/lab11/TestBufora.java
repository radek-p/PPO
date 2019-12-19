package ppo.lab11;

import java.util.Scanner;

public class TestBufora {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        Scanner s = new Scanner(System.in);
        BuforCykliczny b = new BuforCykliczny(5);
        String polecenie = "";
        while (!polecenie.equals("koniec")) {
            System.out.println(b);
            polecenie = s.nextLine();
            // wstawK, wstawP, wyjmijK, wyjmijP
            switch (polecenie) {
                case "wstawK": {
                    b.wstawNaKoniec(s.nextInt());
                    s.nextLine();
                    break;
                }
                case "wstawP": {
                    b.wstawNaPoczatek(s.nextInt());
                    s.nextLine();
                    break;
                }
                case "wyjmijP": {
                    System.out.println(b.wyjmijZPoczatku());
                    break;
                }
                case "wyjmijK": {
                    System.out.println(b.wyjmijZKońca());
                    break;
                }
                default: {
                    System.out.println("Nieznane polecenie!");
                }
            }
        }

    }

    public static void test1() {
        BuforCykliczny b = new BuforCykliczny(5);

        for (int i = 0; i < 20; i += 1) {
            b.wstawNaKoniec(i);
            System.out.println(b);
        }
//        [15,16,17,18,19]
        for (int i = 0; i < 5; ++i) {
            System.out.println(b.wyjmijZKońca());
            System.out.println(b);
        }
    }
}
