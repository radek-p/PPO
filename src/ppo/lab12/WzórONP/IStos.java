package ppo.lab12.WzórONP;

public interface IStos {
    class PustyStos extends Exception {};
    class PełnyStos extends Exception {};

    void wstaw(int liczba) throws PełnyStos;
    int zdejmij() throws PustyStos;
    boolean pusty();
}
