package generics.service;

import generics.models.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objAvailable;

    public RentalService(List<T> objAvailable){
        this.objAvailable = objAvailable;
    }
    public T searchAvailable(){
        System.out.println("Searching...");
        T obj = objAvailable.remove(0);

        System.out.println("Renting " + obj);
        System.out.println("Available to rent: ");
        System.out.println(objAvailable);

        return obj;
    }

    public void returnRent(T obj){
        System.out.println("Returning...");
        objAvailable.add(obj);
        System.out.println("return ok");
        System.out.println("Available to rent: ");
        System.out.println(objAvailable);
    }
}
