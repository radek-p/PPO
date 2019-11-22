package ppo.lab8zastępstwo;

public class Zmienna extends Wyrażenie {
    @Override
    public double oblicz(double x) {
        return x;
    }

    @Override
    public String naNapis() {
        return "x";
    }
}
