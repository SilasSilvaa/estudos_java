package generics;

import collections.models.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");

        for (String s : list) {
            System.out.println(s);
        }
        add(list, new Consumer("Name"));

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void add(List list, Consumer consumer){
            list.add(consumer);
    }
}
