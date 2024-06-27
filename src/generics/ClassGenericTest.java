package generics;

import generics.models.Car;
import generics.service.ProfitableCarService;

public class ClassGenericTest {
    public static void main(String[] args) {
        ProfitableCarService service = new ProfitableCarService();
        Car car = service.searchAvailableCars();
        System.out.println("Use the car for one month");
        service.returnRentCar(car);
    }
}
