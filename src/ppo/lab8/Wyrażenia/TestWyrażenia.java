package ppo.lab8.Wyrażenia;

public class TestWyrażenia {
    public static void main(String[] args) {
        Wyrażenie w1 = new Liczba(5);
        Wyrażenie w2 = new Zmienna();
        Wyrażenie w3 = new OperatorPlus(w1, w2);

        System.out.println(w1.oblicz(10));
        System.out.println(w2.oblicz(10));
        System.out.println(w3.oblicz(10));

        System.out.println(w3.naNapis());
    }
}
