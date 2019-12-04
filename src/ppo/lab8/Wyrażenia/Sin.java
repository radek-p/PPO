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
    public String naNapis() {
        return String.format("sin(%s)", argument.naNapis());
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorRazy(
                new Cos(argument),
                argument.pochodna()
        );
    }
}
