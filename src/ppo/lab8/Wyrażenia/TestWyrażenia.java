package ppo.lab8.Wyrażenia;

public class TestWyrażenia {
    public static void main(String[] args) {
        Wyrażenie w1 = new Liczba(5);    // 5
        Wyrażenie w2 = new Zmienna();           // x
        Wyrażenie w3 = new OperatorPlus(w1, w2);// 5 + x

        Wyrażenie w4 = new Liczba(11);
        Wyrażenie w5 = new OperatorRazy(new OperatorMinus(w4, w3), new Liczba(2));

        Wyrażenie w6 = new Sin(w5);

        System.out.println(w6.naNapis());
        System.out.println("Dla x = 10 wyrażenie to ma wartość:");
        System.out.println(w6.oblicz(10));
    }
}
