package generics.service;

import generics.models.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCarService {
    private List<Car> cars = new ArrayList<>(List.of(new Car("BMW"), new Car("Mercedes")));

    public Car searchAvailableCars(){
        System.out.println("Searching available cars...");
        Car car = cars.remove(0);

        System.out.println("Renting car " + car);
        System.out.println("Cars available to rent: ");
        System.out.println(cars);

        return car;
    }


    public void returnRentCar(Car car){
        System.out.println("Returning car");
        cars.add(car);
        System.out.println("return ok");
        System.out.println("Cars available to rent: ");
        System.out.println(cars);
    }
}
