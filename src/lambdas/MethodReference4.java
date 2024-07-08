package lambdas;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReference4 {
    public static void main(String[] args) {
//      Supplier<AnimeComparator> newAnimeComparators = () -> new AnimeComparator();
        Supplier<AnimeComparator> newAnimeComparators =AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One Piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);

//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Super Campeões", 36));
    }
}
