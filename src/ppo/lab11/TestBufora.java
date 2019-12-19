package ppo.lab11;

public class TestBufora {
    public static void main(String[] args) {
        BuforCykliczny b = new BuforCykliczny(5);

        for (int i = 0; i < 20; i += 1) {
            b.wstawNaKoniec(i);
        }
//        [15,16,17,18,19]
        for (int i = 0; i < 5; ++i) {
            System.out.println(b.wyjmijZKońca());
        }
    }
}
