package ppo.lab12.WzórONP;

import ppo.lab8.WzórWyrażenia.OperatorPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class KalkulatorWyrażeńONP {
    static abstract class BładWyliczania extends Exception { };
    static class DzieleniePrzezZero extends BładWyliczania { };
    static class ZaMałoOperatorów extends BładWyliczania { };
    static class NiedozwolonyZnak extends BładWyliczania {
        private final char c;
        NiedozwolonyZnak(char c) { this.c = c; }
        char getChar() { return c; }
    }

    public static void main(String[] args) {
        String input = "";
        Scanner s = new Scanner(System.in);
        while (!input.equals("koniec")) {
            input = s.nextLine();
            policz(input);
        }
    }

    public static void policz(String s) {
        IStos stos = new ProstyStos(4);
        try {
            for (char c : s.toCharArray()) {
                switch (c) {
                    case '+': {
                        stos.wstaw(stos.zdejmij() + stos.zdejmij());
                        break;
                    }
                    case '-': {
                        int prawy = stos.zdejmij();
                        int lewy = stos.zdejmij();
                        stos.wstaw(lewy - prawy);
                        break;
                    }
                    case '*': {
                        stos.wstaw(stos.zdejmij() * stos.zdejmij());
                        break;
                    }
                    case '/': {
                        int prawy = stos.zdejmij();
                        int lewy = stos.zdejmij();
                        if (prawy == 0) {
                            throw new DzieleniePrzezZero();
                        }
                        stos.wstaw(lewy / prawy);
                        break;
                    }
                    default: {
                        if (Character.isDigit(c)) {
                            stos.wstaw(Integer.parseInt(Character.toString(c)));
                        } else {
                            throw new NiedozwolonyZnak(c);
                        }
                    }
                }
            }
            int wynik = stos.zdejmij();
            if (!stos.pusty())
                throw new ZaMałoOperatorów();
            System.out.printf("%s = %d\n", s, wynik);
        } catch (IStos.PustyStos e) {
            System.out.println("Zbyt dużo operatorów a zbyt mało liczb.");
        } catch (IStos.PełnyStos e) {
            System.out.println("Zbyt skomplikowane wyrażenie.");
        } catch (NiedozwolonyZnak e) {
            System.out.println(String.format("Niedozwolony znak w wyrażeniu: '%c'", e.getChar()));
        } catch (ZaMałoOperatorów zaMałoOperatorów) {
            System.out.println("Zbyt mało operatorów w wyrażeniu.");
        } catch (DzieleniePrzezZero dzieleniePrzezZero) {
            System.out.println("W wyrażeniu pojawiło się dzielenie przez 0.");
        }
    }
}
