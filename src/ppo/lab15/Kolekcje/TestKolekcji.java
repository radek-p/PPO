package ppo.lab15.Kolekcje;

import java.util.Map;
import java.util.TreeMap;

public class TestKolekcji {
    public static void main(String[] args) {
        Map<String, Map<Character, Integer>> p = new TreeMap<>();

        String słowo = "kognitywistyka";
        int długośćPodsłowa = 2;
        for (int i = 0; i < słowo.length() - długośćPodsłowa + 1; ++i) {
            String infiks = słowo.substring(i, i+długośćPodsłowa);
            if (!p.containsKey(infiks)) {
                p.put(infiks, new TreeMap<>());
            }
            if (i < słowo.length() - długośćPodsłowa) {
                Character następnaLitera = słowo.charAt(i+długośćPodsłowa);
                Map<Character, Integer> mapaDlaInfiksu = p.get(infiks);
                if (!mapaDlaInfiksu.containsKey(następnaLitera))
                    mapaDlaInfiksu.put(następnaLitera, 0);
                mapaDlaInfiksu.put(następnaLitera, mapaDlaInfiksu.get(następnaLitera) + 1);
            }
        }
        System.out.println(słowo);
        System.out.println(p);
    }
}
