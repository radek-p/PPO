package ppo.lab8zastępstwo;

public abstract class Operator extends Wyrażenie {
    protected Wyrażenie lewe, prawe;

    public Operator(Wyrażenie lewe, Wyrażenie prawe) {
        this.lewe = lewe;
        this.prawe = prawe;
    }
}
