package ppo.lab6.KontaBankowe;

public class TestDziałaniaBanku {
    public static void main(String[] args) {
        Bank naszBank = new Bank(2);
        System.out.println(naszBank.podajLiczbęKont());
        naszBank.wypiszStanKont();
        naszBank.wykonajLosoweOperacje(4);
        naszBank.wypiszStanKont();
        System.out.println("Suma stanów wszystkich kont:");
        System.out.println(Konto.podajStanWszystkich());
    }
}