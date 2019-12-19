package ppo.lab8.Wyrażenia;

import static java.lang.Math.cos;

public class Cos extends Funkcja1 {

    Cos(Wyrażenie argument) {
        super(argument);
    }

    @Override
    protected String nazwa() {
        return "cos";
    }

    @Override
    public double oblicz(double x) {
        return cos(argument.oblicz(x));
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorRazy(
                new OperatorRazy(new Liczba(-1), new Sin(argument)),
                argument.pochodna()
        );
    }
    @Override
    public Wyrażenie uprość() {
        if (!czyJestZmienna()) {
            return new Liczba(this.oblicz(0));
        } else {
            return new Cos(argument.uprość());
        }
    }
}
