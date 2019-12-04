package ppo.labDodatkowy.Odcinki;

public class Odcinek {
    private int poczatek;
    private int koniec;

    public Odcinek(int poczatek, int koniec) {
        this.poczatek = poczatek;
        this.koniec = koniec;
    }

    public String toString() {
        return String.format("[%d, %d]", poczatek, koniec);
    }

    public boolean czyRówny(Odcinek that) {
        return this.poczatek == that.poczatek &&
               this.koniec == that.koniec;
    }

    public boolean czyNależy(int punkt) {
        return this.poczatek <= punkt && punkt <= this.koniec;
    }
}
