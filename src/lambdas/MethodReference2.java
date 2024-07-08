package lambdas;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReference2 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparator.compareByEpisodesNonStatic(a1, a2 ));
        System.out.println(animeList);
    }
}
