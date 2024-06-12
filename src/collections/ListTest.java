package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");

        names2.add("Name 3");
        names2.add("Name 4");
        names.addAll(names2);

        names.remove("Name 2");

        for (String name : names){
            System.out.println(name);
        }
    }
}
