package ppo.lab8.Wyrażenia;

public abstract class Funkcja1 extends Wyrażenie {
    // sin(2*x + 5 - 11)
    protected Wyrażenie argument;

    Funkcja1(Wyrażenie argument) {
        this.argument = argument;
    }
}
