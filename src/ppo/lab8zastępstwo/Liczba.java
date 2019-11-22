package ppo.lab8zastępstwo;

public class Liczba extends Wyrażenie {
    private double wartość;

    public Liczba(double wartość) {
        this.wartość = wartość;
    }

    @Override
    public double oblicz(double x) {
        return wartość;
    }

    @Override
    public String naNapis() {
        return String.format("%f", wartość);
    }
}
