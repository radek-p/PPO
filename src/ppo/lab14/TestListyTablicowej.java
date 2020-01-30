package ppo.lab14;

import java.util.ArrayList;

public class TestListyTablicowej {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            l.add(i);

        for (int i = 0; i < l.size(); ++i)
            System.out.println(l.get(i));
    }
}
