package collections;

import collections.models.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Atk on Titan", 19.90));
        mangas.add(new Manga(1L, "Berserk", 22.90));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 10.90));
        mangas.add(new Manga(3L, "Pokemon", 20.90));
        mangas.add(new Manga(2L, "DBZ", 30.90));

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("------------");

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("------------");

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
