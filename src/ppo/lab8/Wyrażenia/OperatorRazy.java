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
    public String naNapis() {
        String n1 = lewe.naNapis();
        String n2 = prawe.naNapis();
        if (lewe.czyPotrzebaNawiasu()) {
            n1 = "(" + n1 + ")";
        }
        if (prawe.czyPotrzebaNawiasu()) {
            n2 = "(" + n2 + ")";
        }
        return String.format("%s * %s", n1, n2);
    }

    @Override
    public Wyrażenie pochodna() {
        return new OperatorPlus(
                new OperatorRazy(
                        lewe.pochodna(),
                        prawe
                ),
                new OperatorRazy(
                        lewe,
                        prawe.pochodna()
                )
        );
    }
}
