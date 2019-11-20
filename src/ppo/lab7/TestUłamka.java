package ppo.lab7;

public class TestUłamka {
    public static void main(String[] args) {
        Ułamek u1 = new Ułamek(2,-3);
        Ułamek u2 = new Ułamek(-2,3);
        Ułamek u3 = u1.dodaj(u2);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
