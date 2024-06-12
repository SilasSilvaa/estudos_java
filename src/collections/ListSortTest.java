package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Atk on Titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("DBZ");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga + " " + mangas.indexOf(manga));
        }

        System.out.println("-----------");

        List<Double> moneys = new ArrayList<>();
        moneys.add(100.2);
        moneys.add(20.2);
        moneys.add(10D);
        moneys.add(99.2);

        Collections.sort(moneys);
        for (Double money : moneys){
            System.out.println(money);
        }
    }
}
