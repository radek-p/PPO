package ppo.lab14;

public class ListaTablicowa<TypElementu> {
    private Object[] elementy;
    private int ileElementów = 0;

    public ListaTablicowa() {
        elementy = new Object[1];
    }

    public int length() {
        return ileElementów;
    }

    public TypElementu get(int i) {
        return (TypElementu) elementy[i];
    }

    public void set(int i, TypElementu el) {
        elementy[i] = el;
    }

    public void pushBack(TypElementu el) {
        if (ileElementów == elementy.length) {
            Object[] nowa = new Object[2*elementy.length];
            for (int i = 0; i < elementy.length; ++i) {
                nowa[i] = elementy[i];
            }
            elementy = nowa;
        }

        set(ileElementów, el);
        ileElementów += 1;
    }
}
