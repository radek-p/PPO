package ppo.lab8.Wyrażenia;

import static java.lang.Math.sin;

public class Sin extends Funkcja1 {

    Sin(Wyrażenie argument) {
        super(argument);
    }

    @Override
    public double oblicz(double x) {
        return sin(argument.oblicz(x));
    }

    @Override
    protected String nazwa() {
        return "sin";
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorRazy(
                new Cos(argument),
                argument.pochodna()
        );
    }

    @Override
    public Wyrażenie uprość() {
        if (!czyJestZmienna()) {
            return new Liczba(this.oblicz(0));
        } else {
            return new Sin(argument.uprość());
        }
    }

}
