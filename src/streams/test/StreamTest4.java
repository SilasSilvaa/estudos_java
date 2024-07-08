package streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest4 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> graphicDesigners = List.of("Name 1", "Name 2", "Name 3");
        List<String> developers = List.of("Name 4", "Name 5", "Name 6");
        List<String> students = List.of("Name 7", "Name 8", "Name 9");

        list.add(graphicDesigners);
        list.add(developers);
        list.add(students);

//        for (List<String> peoples : list) {
//            for(String person: peoples){
//                System.out.println(person);
//            }
//        }

        list.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
