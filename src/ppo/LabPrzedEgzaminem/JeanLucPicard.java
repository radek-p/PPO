package ppo.LabPrzedEgzaminem;

import java.util.*;

public class JeanLucPicard extends Kapitan {
    @Override
    protected List<Załogant> wybierzSkład(Planeta p) {
        List<Załogant> załoganci = getStatek().getPełnaZałoga();
        Map<Załogant, Float> chęci = new HashMap<>();
        for (Załogant z : załoganci) {
            Float chęćWyjazdu = z.getChęćLotu(p);
            chęci.put(z, chęćWyjazdu);
        }

        List<Załogant> zespół = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            Załogant nowyCzłonekWyprawy = Collections.max(chęci.entrySet(), Map.Entry.comparingByValue()).getKey();
            chęci.remove(nowyCzłonekWyprawy);
            zespół.add(nowyCzłonekWyprawy);
        }

        return zespół;
    }

    @Override
    protected boolean analizujWyniki(List<Float> wynikiAnaliz) {
        float suma = 0;
        for (Float wynik : wynikiAnaliz) {
            suma += wynik;
        }
        float średnia = suma / wynikiAnaliz.size();
        return średnia >= 0.5;
    }

    @Override
    Float getChęćLotu(Planeta p) {
        return (float) 0;
    }
}
