package ppo.lab8.Wyrażenia;

abstract public class Wyrażenie {
    public abstract double oblicz(double x);

    public abstract String naNapis();

    public abstract Wyrażenie pochodna();

    protected int priorytet() {
        return 10;
    }

    abstract protected boolean czyJestZmienna();

    public Wyrażenie uprość() {
        return this;
    }
}
