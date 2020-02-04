package ppo.LabPrzedEgzaminem;

import java.util.List;

public class Worf extends Oficer {

    public Worf() {
        super("", "Worf");
    }

    @Override
    public Float analizuj(List<Dana> dane) {
        int liczbaZdjęć = 0;
        for (Dana d : dane) {
            if (d instanceof Zdjęcie) {
                liczbaZdjęć += 1;
                if (!czyMaDrogę((Zdjęcie) d)) {
                    return (float) 0;
                }
            }
        }
        if (liczbaZdjęć == 0)
            return (float) 0;
        return (float) 1.0;
    }

    private boolean czyMaDrogę(Zdjęcie d) {
        for (int i = 0; i < d.getWysokość(); ++i) {
            boolean czyJestDroga = true;
            for (int j = 0; j < d.getSzerokość(); ++j) {
                if (!d.getPole(i, j))
                    czyJestDroga = false;
            }
            if (czyJestDroga)
                return true;
        }
        return false;
    }

    @Override
    Float getChęćLotu(Planeta p) {
        return (float) 0;
    }
}
