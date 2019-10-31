package ppo.lab5;

public class WyszukiwanieWzorca {
    public static void main(String[] args) {
        String tekst = "Litwo, ojczyzno moja!";
        String wzorzec = "ja";

        int wynik = znajdźWzorzec(tekst, wzorzec);
        System.out.println("Wzorzec znaleziony na pozycji:");
        System.out.println(wynik);
    }

    // W komentarzach - dla porównania - znajduje się wersja w składni Pythona
    public static int znajdźWzorzec(String tekst, String wzorzec) {
//      for i in range(0, len(tekst)-len(wzorzec)+1):
        for (int i = 0; i < tekst.length() - wzorzec.length() + 1; ++i) {
//          liczba_dopasowanych = 0
            int liczba_dopasowanych = 0;
//          for j in range(0, len(wzorzec)):
            for (int j = 0; j < wzorzec.length(); ++j) {
//              if tekst[i+j] == wzorzec[j]:
                if (tekst.charAt(i+j) == wzorzec.charAt(j)) {
//                  liczba_dopasowanych += 1
                    ++liczba_dopasowanych;
                }
            }
//          if liczba_dopasowanych == len(wzorzec):
            if (liczba_dopasowanych == wzorzec.length()) {
//              return i
                return i;
            }
        }
//      return -1
        return -1;
    }
}
