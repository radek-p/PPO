package ppo.lab6.KontaBankowe;

import java.util.Random;

public class Bank {
    private Konto[] konta;

    public Bank(int liczbaKont) {
        konta = new Konto[liczbaKont];
        for (int i = 0; i < liczbaKont; ++i) {
            konta[i] = new Konto(i);
        }
    }

    public int podajLiczbęKont() {
        return konta.length;
    }

    public void wypiszStanKont() {
        for (Konto k : konta) {
            k.wypiszStan();
        }
    }

    public void wykonajLosoweOperacje(int n) {
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            int idKonta = r.nextInt(konta.length);
            Konto wylosowane = konta[idKonta];
            int kwotaTransakcji = r.nextInt(201) - 100;
            if (kwotaTransakcji < 0) {
                wylosowane.wypłać(-kwotaTransakcji);
            } else {
                wylosowane.wpłać(kwotaTransakcji);
            }
        }
    }
}
