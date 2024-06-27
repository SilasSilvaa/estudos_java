package generics;

import java.util.LinkedList;
import java.util.List;

public class WildCardTest2 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printConsult(dogs);
        printConsult(cats);

        System.out.println("------");

        List<Animal> animals = new LinkedList<>();
        printConsultAnimal(animals);
        System.out.println(animals);
    }
    private static void printConsult(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    private static void printConsultAnimal(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
