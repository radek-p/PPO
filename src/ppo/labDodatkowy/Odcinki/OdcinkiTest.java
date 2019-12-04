package ppo.labDodatkowy.Odcinki;

public class OdcinkiTest {
    public static void main(String[] args) {
        Odcinki odcinki = new OdcinkiTab();
        Odcinek dane[] = {new Odcinek(1, 2), new Odcinek(3, 90),
                new Odcinek(1, 2), new Odcinek(-5, -3)};
        // test wstawiania
        System.out.println("Przed wstawianiem: odcinki = " + odcinki);
        for (Odcinek odc : dane)
            System.out.print(odcinki.dodaj(odc) + " ");
        System.out.println();
        System.out.println("Po wstawianiu: odcinki = " + odcinki);
        // test należenia
        int pkty[] = {-4, -3, 0, 1, 2, 3, 90, 91};
        for (int x : pkty)
            System.out.println("Punkt " + x + ": " + (odcinki.sprawdźCzyNależy(x) ? "należy" : "nie należy"));
        }
}
