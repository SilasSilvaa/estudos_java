package streams.test;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest6 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desugaa", 1.99),
            new LightNovel("Kumo desugaa", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 0));

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice()> 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice()> 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
