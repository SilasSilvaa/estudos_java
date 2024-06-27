package generics;

import generics.models.Car;

import java.util.ArrayList;
import java.util.List;

public class MethodGenericTest {
    public static void main(String[] args) {

        List<Car> carList = createArray(new Car("Carro 1"));
        System.out.println(carList);
    }

    private static <T> List<T> createArray(T t){
        return List.of(t);
    }
//    private static <T extends Comparable> void createArray(T t){
//        List<T> obj = new ArrayList<>(List.of(t));
//        System.out.println(obj);
//    }
}


