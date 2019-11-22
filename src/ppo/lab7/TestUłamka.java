package ppo.lab7;

public class TestUłamka {
    public static void main(String[] args) {
        Ułamek u1 = new Ułamek(2,3);
        Ułamek u2 = new Ułamek(1,5);

        System.out.println(u1);
        System.out.println(u2);

        Ułamek w1 = u1.dodaj(u2);
        Ułamek w2 = u1.odejmij(u2);
        Ułamek w3 = u1.pomnóż(u2);
        Ułamek w4 = u1.podziel(u2);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
    }
}
