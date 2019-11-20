package ppo.lab6.KontaBankowe;

public class Konto {
    private int numer;
    private int stanKonta;

    static private int sumaStanówWszystkichKont = 0;

    public static int podajStanWszystkich() {
        return sumaStanówWszystkichKont;
    }

    public Konto(int numer) {
        this.numer = numer;
        stanKonta = 0;
    }

    public int podajStanKonta() {
        return stanKonta;
    }

    public void wypiszStan() {
        System.out.println(
                String.format("nummer konta: %d, jego stan: %d", numer, stanKonta)
        );
//        System.out.print("nummer konta: ");
//        System.out.print(numer);
//        System.out.print(", jego stan: ");
//        System.out.println(stanKonta);
    }

    public void wypłać(int kwotaTransakcji) {
        stanKonta -= kwotaTransakcji;
        sumaStanówWszystkichKont -= kwotaTransakcji;
    }

    public void wpłać(int kwotaTransakcji) {
        stanKonta += kwotaTransakcji;
        sumaStanówWszystkichKont += kwotaTransakcji;
    }
}
