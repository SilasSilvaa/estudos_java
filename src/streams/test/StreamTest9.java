package streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest9 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Name 1", "Name 2", "Name 3")
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        int num[] = {1, 2, 3, 4, 5};
        Arrays.stream(num).average()
                .ifPresent(System.out::println);

        System.out.println("-----");
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {

            lines.filter(l -> l.contains("Java")).forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
