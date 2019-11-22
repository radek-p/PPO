package ppo.lab8zastępstwo;

public abstract class Wyrażenie {
    public abstract double oblicz(double x);
    public abstract String naNapis();

    @Override
    public String toString() {
        return naNapis();
    }

    public double całkaOznaczona(double a, double b, int podział) {
        double wynik = 0;
        double szerokość = (b - a) / podział;
        for (int i = 0; i < podział; ++i) {
            double wartość = oblicz(a + szerokość*i + 0.5 *  szerokość);
            double pole = wartość * szerokość;
            wynik += pole;
        }
        return wynik;
    }
}
