package ppo.lab8.Wyrażenia;

public abstract class Funkcja1 extends Wyrażenie {
    protected Wyrażenie argument;

    Funkcja1(Wyrażenie argument) {
        this.argument = argument;
    }

    @Override
    public String naNapis() {
        return String.format("%s(%s)", nazwa(), argument.naNapis());
    }

    abstract protected String nazwa();

    @Override
    protected boolean czyJestZmienna() {
        return argument.czyJestZmienna();
    }
}
