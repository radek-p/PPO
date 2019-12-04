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
    public String naNapis() {
        String n1 = lewe.naNapis();
        String n2 = prawe.naNapis();
        return String.format("%s - %s", n1, n2);
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorMinus(
                lewe.pochodna(),
                prawe.pochodna()
        );
    }

    @Override
    protected boolean czyPotrzebaNawiasu() {
        return true;
    }
}
