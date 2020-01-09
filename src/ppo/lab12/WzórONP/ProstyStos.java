package ppo.lab12.WzórONP;

public class ProstyStos implements IStos {
    private int[] tablica;
    int następnyPusty = 0;

    ProstyStos(int rozmiar) {
        tablica = new int[rozmiar];
    }

    @Override
    public void wstaw(int liczba) throws PełnyStos {
        if (następnyPusty == tablica.length)
            throw new PełnyStos();
        tablica[następnyPusty++] = liczba;
    }

    @Override
    public int zdejmij() throws PustyStos {
        if (następnyPusty == 0)
            throw new PustyStos();
        return tablica[--następnyPusty];
    }

    @Override
    public boolean pusty() {
        return następnyPusty == 0;
    }
}
