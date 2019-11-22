package ppo.lab8zastępstwo;

public class TestWyrażenia {
    public static void main(String[] args) {
        Wyrażenie w1 = new Liczba(5);
        Wyrażenie w2 = new Zmienna();
        Wyrażenie w3 = new OperatorPlus(w1, w2);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        System.out.println("Obliczanie pola trójkąta " +
                "o wierzchołkach w punktach {(0,0), (10,0), (10, 10)}" +
                " jako całki z funkcji f(x) = x:");
        System.out.println(w2.całkaOznaczona(0, 10, 1000));
    }
}
