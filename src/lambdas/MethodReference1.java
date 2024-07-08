package lambdas;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reference to a static method
public class MethodReference1 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 900), new Anime("Naruto", 500)));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, (a1, a2) -> AnimeComparator.compareByTitle(a1, a2));
        Collections.sort(animeList, AnimeComparator::compareByTitle);
        System.out.println(animeList);

        Collections.sort(animeList, AnimeComparator::compareByEpisodes);
        System.out.println(animeList);

        animeList.sort(AnimeComparator::compareByTitle);
        System.out.println(animeList);

        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);
    }
}
