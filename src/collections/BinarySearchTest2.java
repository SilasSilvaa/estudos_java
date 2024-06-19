package collections;

import collections.models.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest2 {
    public static void main(String[] args) {

        MangaByIdComparator idComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Atk on Titan", 19.90));
        mangas.add(new Manga(1L, "Berserk", 22.90));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 10.90));
        mangas.add(new Manga(3L, "Pokemon", 20.90));
        mangas.add(new Manga(2L, "DBZ", 30.90));

//        Collections.sort(mangas);
        mangas.sort(idComparator);

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Manga dbz = new Manga(2L, "DBZ", 30.90);

        System.out.println(Collections.binarySearch(mangas, dbz, idComparator));
    }
}
