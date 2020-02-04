package ppo.LabPrzedEgzaminem;

import java.util.ArrayList;
import java.util.List;

public abstract class Statek {
    private Kapitan kapitan;
    private PierwszyOficer pierwszyOficer;
    private List<Oficer> oficerList;
    private List<ZwykłyZałogant> zwykłyZałogantList;

    public Statek(Kapitan kapitan, PierwszyOficer pierwszyOficer, List<Oficer> oficerList, List<ZwykłyZałogant> zwykłyZałogantList) {
        this.kapitan = kapitan;
        this.pierwszyOficer = pierwszyOficer;
        this.oficerList = oficerList;
        this.zwykłyZałogantList = zwykłyZałogantList;
    }

    public Kapitan getKapitan() {
        return kapitan;
    }

    public PierwszyOficer getPierwszyOficer() {
        return pierwszyOficer;
    }

    public List<Oficer> getOficerList() {
        return oficerList;
    }

    public List<ZwykłyZałogant> getZwykłyZałogantList() {
        return zwykłyZałogantList;
    }

    public abstract void wyślijNaPlanetę(List<Załogant> składEkspedycji, Planeta p);

    public List<Załogant> getPełnaZałoga() {
        List<Załogant> wynik = new ArrayList<>();
        wynik.add(kapitan);
        wynik.add(pierwszyOficer);
        wynik.addAll(oficerList);
        wynik.addAll(zwykłyZałogantList);
        return wynik;
    }
}
