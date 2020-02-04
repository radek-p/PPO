package ppo.LabPrzedEgzaminem;

import java.util.List;

public abstract class PierwszyOficer extends Załogant {
    public PierwszyOficer(String imię, String nazwisko) {
        super(imię, nazwisko);
    }

    public abstract List<Dana> zbierajDane(Planeta p);
}
