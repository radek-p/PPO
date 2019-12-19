package ppo.lab8.Wyrażenia;

public class OperatorRazy extends Operator {
    OperatorRazy(Wyrażenie lewe, Wyrażenie prawe) {
        super(lewe, prawe);
    }

    @Override
    public double oblicz(double x) {
        return lewe.oblicz(x) * prawe.oblicz(x);
    }

    @Override
    protected String symbol() {
        return "*";
    }

    @Override
    public Wyrażenie pochodna() {
        // d/dx f(x) * g(x)
        return new OperatorPlus(
                new OperatorRazy(lewe.pochodna(), prawe),
                new OperatorRazy(lewe, prawe.pochodna())
        );
    }

    @Override
    protected int priorytet() {
        return 9;
    }

    @Override
    public Wyrażenie uprość() {
        if (!czyJestZmienna()) {
            return new Liczba(this.oblicz(0));
        } else {
            return new OperatorRazy(
                    lewe.uprość(),
                    prawe.uprość()
            );
        }
    }
}
