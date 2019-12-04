package ppo.lab8.Wyrażenia;

import static java.lang.Math.cos;

public class Cos extends Funkcja1 {

    Cos(Wyrażenie argument) {
        super(argument);
    }

    @Override
    public double oblicz(double x) {
        return cos(argument.oblicz(x));
    }

    @Override
    public String naNapis() {
        return String.format("cos(%s)", argument.naNapis());
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorRazy(
                new OperatorRazy(new Liczba(-1), new Sin(argument)),
                argument.pochodna()
        );
    }
}
