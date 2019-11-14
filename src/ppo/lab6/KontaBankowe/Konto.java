package ppo.lab6.KontaBankowe;

public class Konto {
    int numer;
    int stanKonta;

    Konto(int numer) {
        this.numer = numer;
        stanKonta = 0;
    }

    void wypiszStan() {
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
    }
    public void wpłać(int kwotaTransakcji) {
        stanKonta += kwotaTransakcji;
    }
}
