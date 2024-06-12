package collections;

import collections.models.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("ASD21A", "test 1");
        Smartphone smartphone2 = new Smartphone("ASD213", "test 2");
        Smartphone smartphone3 = new Smartphone("ASD2D3", "test 3");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(0, smartphone3);

//        smartphones.clear();
        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone.toString());
        }

        Smartphone smartphone4 = new Smartphone("ASD213", "test 2");
        System.out.println(smartphones.contains(smartphone4));

        int i = smartphones.indexOf(smartphone4);
        System.out.println(i);

    }
}
