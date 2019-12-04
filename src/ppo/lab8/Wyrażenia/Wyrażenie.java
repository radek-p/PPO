package ppo.lab8.Wyrażenia;

abstract public class Wyrażenie {
    public abstract double oblicz(double x);

    public abstract String naNapis();

    public abstract Wyrażenie pochodna();

    protected boolean czyPotrzebaNawiasu() {
        return false;
    }
}
