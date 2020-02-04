package ppo.LabPrzedEgzaminem;

import java.util.List;

public class Zdjęcie extends Dana {
    List<List<Boolean>> macierz;

    public boolean getPole(int x, int y) {
        return macierz.get(y).get(x);
    }
}
