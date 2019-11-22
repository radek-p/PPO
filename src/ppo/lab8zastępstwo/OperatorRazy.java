package ppo.lab8zastępstwo;

public class OperatorRazy extends Operator {
    public OperatorRazy(Wyrażenie lewe, Wyrażenie prawe) {
        super(lewe, prawe);
    }

    @Override
    public double oblicz(double x) {
        double wl = lewe.oblicz(x);
        double wp = prawe.oblicz(x);
        return wl * wp;
    }

    @Override
    public String naNapis() {
        return String.format(
                "%s * %s",
                lewe,
                prawe
        );
    }
}
