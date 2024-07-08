package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> strings = List.of("ATest", "BTest", "CTest");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(strings, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
