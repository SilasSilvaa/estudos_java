package collections;

import collections.models.Manga;
import collections.models.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneTestComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}


class MangaComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneTestComparator());
        System.out.println(smartphones);

        System.out.println("----------");

//        NavigableSet<Manga> mangas = new TreeSet<>();
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaComparator());
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));

//        for (Manga manga : mangas.descendingSet()) {
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------");

        Manga yuyu = new Manga(1L, "Yuyu Hakusho", 8, 5);
        System.out.println("lower < " + mangas.lower(yuyu));
        System.out.println("higher > " + mangas.higher(yuyu));
        System.out.println("ceiling >= " + mangas.ceiling(yuyu));
        System.out.println("floor <= " + mangas.floor(yuyu));

        System.out.println(mangas.size());
        // Get first element and remove
        System.out.println(mangas.pollFirst());
        // Get last element and remove
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
