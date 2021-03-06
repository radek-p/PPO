package ppo.lab8.Wyrażenia;

public class Zmienna extends Wyrażenie {
    @Override
    public double oblicz(double x) {
        return x;
    }

    @Override
    public String naNapis() {
        return "x";
    }

    @Override
    public Wyrażenie pochodna() {
        return new Liczba(1);
    }

    @Override
    protected boolean czyJestZmienna() {
        return true;
    }
}
