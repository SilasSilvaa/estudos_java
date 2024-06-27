package generics;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting little dog");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting little cat");
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(), new Dog() };
        Cat[] cats = { new Cat(), new Cat() };

        printConsult(dogs);
        printConsult(cats);
        System.out.println("--------");

        Animal[] animals = {new Dog(), new Cat()};
        printConsult(animals);
    }
    private static void printConsult(Animal[] animals){
        for (Animal animal : animals) {
            animal.consult();
        }

    }
}
