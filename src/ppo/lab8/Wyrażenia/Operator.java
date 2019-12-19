package ppo.lab8.Wyrażenia;

public abstract class Operator extends Wyrażenie {
    protected Wyrażenie lewe, prawe;

    Operator(Wyrażenie lewe, Wyrażenie prawe) {
        this.lewe = lewe;
        this.prawe = prawe;
    }

    @Override
    public String naNapis() {
        String n1 = lewe.naNapis();
        String n2 = prawe.naNapis();
        if (lewe.priorytet() < this.priorytet()) {
            n1 = "(" + n1 + ")";
        }
        if (prawe.priorytet() <= this.priorytet()) {
            n2 = "(" + n2 + ")";
        }
        return String.format("%s %s %s", n1, this.symbol(), n2);
    }

    protected abstract String symbol();

    @Override
    protected boolean czyJestZmienna() {
        return lewe.czyJestZmienna() || prawe.czyJestZmienna();
    }
}
