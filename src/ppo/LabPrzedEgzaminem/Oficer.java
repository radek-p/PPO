package ppo.LabPrzedEgzaminem;

import java.util.List;

public abstract class Oficer extends Załogant {
    public Oficer(String imię, String nazwisko) {
        super(imię, nazwisko);
    }

    public abstract Float analizuj(List<Dana> dane);
}
