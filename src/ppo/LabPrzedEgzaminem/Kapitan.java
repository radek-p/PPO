package ppo.LabPrzedEgzaminem;

import java.util.ArrayList;
import java.util.List;

public abstract class Kapitan extends Załogant {
    public void zbadajPlanetę(Planeta p) {
        List<Dana> dane = getStatek().getPierwszyOficer().zbierajDane(p);
        List<Float> wynikiAnaliz = new ArrayList<>();
        for (Oficer o : getStatek().getOficerList()) {
            Float wynikAnalizy = o.analizuj(dane);
            wynikiAnaliz.add(wynikAnalizy);
        }
        if (analizujWyniki(wynikiAnaliz)) {
            // wyślij ekspedycję
            List<Załogant> składEkspedycji = wybierzSkład(p);
            getStatek().wyślijNaPlanetę(składEkspedycji, p);
        }
    }

    protected abstract List<Załogant> wybierzSkład(Planeta p);

    protected abstract boolean analizujWyniki(List<Float> wynikiAnaliz);
}
