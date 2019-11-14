package ppo.lab6;

public class PrzykładCzytaniaArgumentów {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Zbyt mało argumentów");
        } else {
            for (String arg : args) {
                int liczba = Integer.parseInt(arg);
                // Rozwiazanie
                System.out.println(liczba*liczba);
            }
        }
    }
}
