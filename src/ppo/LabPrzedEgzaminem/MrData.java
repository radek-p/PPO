package ppo.LabPrzedEgzaminem;

import java.util.List;

public class MrData extends Oficer {

    public MrData(String imię, String nazwisko) {
        super("", "MrData");
    }

    @Override
    public Float analizuj(List<Dana> dane) {
        int liczbaPomiarS = 0;
        for (Dana d : dane) {
            if (d instanceof PomiarS) {
                liczbaPomiarS += 1;
                if (czyMaCywilizację((PomiarS) d)) {
                    return (float) 1;
                }
            }
        }
        return (float) 0;
    }

    private boolean czyMaCywilizację(PomiarS d) {
        for (int i = 1; i < d.getSzerokość() - 1; ++i) {
            for (int j = 1; j < d.getWysokość() - 1; ++j) {
                if (czyMaCywilizację(d, i, j))
                    return true;
            }
        }
        return false;
    }

    private boolean czyMaCywilizację(PomiarS d, int i, int j) {
        if (d.getPole(i, j) == 0)
            return false;

        for (int di = -1; di <= 1; ++di) {
            for (int dj = -1; dj <= 1; ++dj) {
                if (di != 0 || dj != 0) {
                    if (d.getPole(i+di, j+dj) != 0)
                        return false;
                }
            }
        }

        return true;
    }

    @Override
    Float getChęćLotu(Planeta p) {
        return (float) 0;
    }
}
