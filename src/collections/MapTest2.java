package collections;

import collections.models.Consumer;
import collections.models.Manga;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Consumer consumer = new Consumer("Consumer 1");
        Consumer consumer2 = new Consumer("Consumer 2");

        Manga hellsingUltimate = new Manga(5L, "Hellsing Ultimate", 19.9, 0);
        Manga berserk = new Manga(1L, "Berserk", 9.5, 5);
        Manga pokemon = new Manga(4L, "Pokemon", 3.2, 2);
        Manga attackOnTitan = new Manga(3L, "Attack on titan", 11.20, 0);
        Manga dragonBallZ = new Manga(2L, "Dragon Ball Z", 2.99, 0);

        List<Manga> consumerList = new LinkedList<>(List.of(berserk, hellsingUltimate, pokemon));
        List<Manga> consumer2List = new LinkedList<>(List.of(berserk, attackOnTitan, dragonBallZ));
        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();

        consumerMangaMap.put(consumer, consumerList);
        consumerMangaMap.put(consumer2, consumer2List);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()){
                System.out.print(manga.getName() + " ");
            }
            System.out.println();
        }
//        consumerMangaMap.put(consumer, hellsingUltimate);
//        consumerMangaMap.put(consumer2, attackOnTitan);

//        for (Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()){
//            System.out.println(entry.getKey().getName() + " " + entry.getValue().getName());
//        }

    }
}
