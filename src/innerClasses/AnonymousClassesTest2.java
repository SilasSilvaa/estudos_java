package innerClasses;

import generics.models.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class BoatComparator implements Comparator<Boat>{
    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest2 {
    public static void main(String[] args) {
        List<Boat> boats = new ArrayList<>(List.of(new Boat("Boat 2"), new Boat("Boat 1")));

        boats.sort(new Comparator<Boat>(){
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(boats);
    }
}
