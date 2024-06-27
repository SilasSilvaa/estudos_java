package generics;

import generics.models.Boat;
import generics.models.Car;
import generics.service.ProfitableCarService;
import generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericTest2 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("BMW"), new Car("Mercedes")));
        List<Boat> boats = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

        RentalService<Car> carRentalService = new RentalService<>(cars);
        RentalService<Boat> boatRentalService = new RentalService<>(boats);

        Boat boat = boatRentalService.searchAvailable();
        System.out.println("---");
        boatRentalService.returnRent(boat);
        System.out.println("---");
        boatRentalService.searchAvailable();
    }
}
