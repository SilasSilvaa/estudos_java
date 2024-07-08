package optional;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Test");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----");

        Optional<String> nameOptional = findName("Name 1");
        String empty = nameOptional.orElse("Empty");
        System.out.println(empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Name 1", "Name 2");
        int i = list.indexOf(name);

        if(i != 1){
            Optional.of(list.get(i));
        }

        return Optional.empty();
   }
}
