package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

//        Object[] numbersObject = numbers.toArray();
        Integer[] listToArr = numbers.toArray(new Integer[0]);

        System.out.println(Arrays.toString(listToArr));
        System.out.println("--------");

        Integer[] numbersArr = new Integer[3];
        numbersArr[0] = 1;
        numbersArr[1] = 2;
        numbersArr[2] = 3;

        List<Integer> arrToList = Arrays.asList(numbersArr);

        arrToList.set(0, 12);

        System.out.println(Arrays.toString(numbersArr));
        System.out.println(arrToList);

        System.out.println("--------");

        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArr));

        numbersList.add(15);
        System.out.println(numbersList);

        System.out.println("--------");

        List<String> list = Arrays.asList("1", "2");
//        List<Integer> integers = List.of(1, 2, 3, 4);
    }
}
