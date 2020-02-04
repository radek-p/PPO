package ppo.LabPrzedEgzaminem;

public abstract class Załogant {
    private Statek statek;

    public Statek getStatek() {
        return statek;
    }

    public void setStatek(Statek statek) {
        this.statek = statek;
    }

    abstract Float getChęćLotu(Planeta p);
}
