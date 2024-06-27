package collections;

import collections.models.Consumer;
import collections.models.Manga;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("D");

        for (String s : queue) {
            System.out.println(s);
        }

        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//            System.out.println(queue.peek());
//            System.out.println(queue.offer());;
        }

        System.out.println("-----------");
        Queue<Manga> mangas = new PriorityQueue<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));
    }
}
