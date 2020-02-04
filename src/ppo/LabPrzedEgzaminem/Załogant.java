package ppo.LabPrzedEgzaminem;

public abstract class Załogant {
    private Statek statek;

    String imię, nazwisko;

    public Załogant(String imię, String nazwisko) {
        this.imię = imię;
        this.nazwisko = nazwisko;
    }

    public Statek getStatek() {
        return statek;
    }

    public void setStatek(Statek statek) {
        this.statek = statek;
    }

    abstract Float getChęćLotu(Planeta p);
}
