package behavior;

import behavior.interfaces.CarPredicate;
import behavior.models.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest {
    private static List<Car> cars = List.of(new Car(2011, "green"), new Car(1998, "black"), new Car(2019, "red"));

    public static void main(String[] args) {
//        System.out.println(filterGreenCar(cars));
        List<Integer> numbers = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> filtered = filterNew(cars, car -> car.getColor().equals("red"));
        List<Integer> integerList = filterNew(numbers, integer -> integer > 5);

//       List<Car> greenCars = filter(cars, new Predicate<Car>() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        System.out.println(integerList);
        System.out.println(filtered);
        System.out.println(greenCars);
    }

    private static <T> List<T> filterNew(List<T> tList, Predicate<T> tPredicate){
        List<T> list = new ArrayList<>();

        for (T t : tList) {
            if(tPredicate.test(t)){
                list.add(t);
            }
        }
        return list;
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

}
