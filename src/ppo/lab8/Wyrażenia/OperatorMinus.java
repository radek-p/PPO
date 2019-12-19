package ppo.lab8.Wyrażenia;

public class OperatorMinus extends Operator {
    OperatorMinus(Wyrażenie lewe, Wyrażenie prawe) {
        super(lewe, prawe);
    }

    @Override
    public double oblicz(double x) {
        return lewe.oblicz(x) - prawe.oblicz(x);
    }

    @Override
    protected String symbol() {
        return "-";
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorMinus(lewe.pochodna(), prawe.pochodna());
    }

    @Override
    protected int priorytet() {
        return 8;
    }


    @Override
    public Wyrażenie uprość() {
        if (!czyJestZmienna()) {
            return new Liczba(this.oblicz(0));
        } else {
            return new OperatorMinus(
                    lewe.uprość(),
                    prawe.uprość()
            );
        }
    }
}
