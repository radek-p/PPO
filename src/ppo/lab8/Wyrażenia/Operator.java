package ppo.lab8.Wyrażenia;

public abstract class Operator extends Wyrażenie {
    protected Wyrażenie lewe, prawe;

    Operator(Wyrażenie lewe, Wyrażenie prawe) {
        this.lewe = lewe;
        this.prawe = prawe;
    }
}
