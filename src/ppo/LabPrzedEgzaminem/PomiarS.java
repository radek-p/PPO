package ppo.LabPrzedEgzaminem;

import java.util.List;

public class PomiarS extends Dana {
    List<List<Integer>> macierz;

    public int getPole(int x, int y) {
        return macierz.get(y).get(x);
    }
}
