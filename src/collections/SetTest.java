package collections;

import collections.models.Manga;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
//        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
