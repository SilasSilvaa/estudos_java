package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

//        (-(ponto de inserção) -1)
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 2));
    }
}
