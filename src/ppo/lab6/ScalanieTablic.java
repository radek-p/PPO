package ppo.lab6;

public class ScalanieTablic {
    public static void main(String[] args) {
        int[] tablica1 = {1,3,5,7,9,9,11};
        int[] tablica2 = {2,4,6,6,8,8,10,12,100,200,300};
        // {1,2,3,4,5,6,6,7,8,8,9,9,10,11,12}
        wypiszTablicę(tablica1);
        wypiszTablicę(tablica2);
        int[] scalonaTablica = scalTablice(tablica1, tablica2);
        wypiszTablicę(scalonaTablica);
    }

    private static int[] scalTablice(int[] tablica1, int[] tablica2) {
        int[] wynik = new int[tablica1.length + tablica2.length];

        int i = 0, j = 0;
        while (i < tablica1.length && j < tablica2.length) {
            if (tablica1[i] < tablica2[j]) {
                wynik[i+j] = tablica1[i];
                i += 1;
            } else {
                wynik[i+j] = tablica2[j];
                j += 1;
            }
        }
        while (i < tablica1.length) {
            wynik[i+j] = tablica1[i];
            i += 1;
        }
        while (j < tablica2.length) {
            wynik[i+j] = tablica2[j];
            j += 1;
        }

        return wynik;
    }

    private static void wypiszTablicę(int[] tablica) {
        System.out.print("[");
        for (int x : tablica) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
