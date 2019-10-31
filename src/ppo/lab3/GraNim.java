package ppo.lab3;

import java.util.Scanner;

public class GraNim {

    public static void main(String[] args) {
        graj(10);
    }

    public static void wypiszPlanszę(int A, int B) {
        String stosA = "";
        String stosB = "";
        for (int i = 0; i < A; i += 1)
            stosA += "#";
        for (int i = 0; i < B; i += 1)
            stosB += "#";
        System.out.println("------------------------------");
        System.out.println("A: " + stosA);
        System.out.println("B: " + stosB);
        System.out.println("------------------------------");
    }

    // Kod do tego momentu udało się napisać na zajęciach.

    public static int następnyGracz(int numerGracza) {
        return 3 - numerGracza;
    }

    public static void graj(int N) {
        System.out.println("Gra nim");
        int A = N, B = N;
        int numerGracza = 1;
        Scanner in = new Scanner(System.in);

        wypiszPlanszę(A, B);

        while (A > 0 || B > 0) {
            System.out.println(String.format("Kolej gracza numer %d", numerGracza));
            String stos = "";
            while (!stos.equals("A") && !stos.equals("B")) {
                System.out.println("Podaj stos (A/B):");
                stos = in.nextLine();
            }

            int liczbaKamieni = -1;
            while (liczbaKamieni < 1
                    || stos.equals("A") && liczbaKamieni > A
                    || stos.equals(B) && liczbaKamieni > B) {
                System.out.println("Podaj liczbę kamieni do zdjęcia:");
                liczbaKamieni = Integer.parseInt(in.nextLine());
            }

            if (stos.equals("A"))
                A -= liczbaKamieni;
            else
                B -= liczbaKamieni;

            wypiszPlanszę(A, B);
            numerGracza = następnyGracz(numerGracza);
        }
        System.out.println(String.format("Wygrał gracz nr %d", następnyGracz(numerGracza)));
    }

}
