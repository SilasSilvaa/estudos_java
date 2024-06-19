package collections;

import collections.models.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
//        List<Manga> mangas = new ArrayList<>(6);
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Atk on Titan", 19.90, 0));
        mangas.add(new Manga(1L, "Berserk", 22.90, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 10.90,0));
        mangas.add(new Manga(3L, "Pokemon", 20.90, 2));
        mangas.add(new Manga(2L, "DBZ", 30.90,0));

        //Not
//        for (Manga manga : mangas) {
//            if(manga.getAmount() == 0){
//                mangas.remove(manga);
//            }
//        }

        mangas.removeIf(manga -> manga.getAmount() == 0);
        System.out.println(mangas);
    }
}
