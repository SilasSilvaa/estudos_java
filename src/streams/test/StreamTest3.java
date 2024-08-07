package streams.test;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest3 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desugaa", 1.99),
            new LightNovel("Kumo desugaa", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream.filter(lightNovel -> lightNovel.getPrice() <= 4).count();
        long count2 = lightNovels.stream().distinct().filter(lightNovel -> lightNovel.getPrice() <= 4).count();

        System.out.println(count);
        System.out.println(count2);
    }
}
