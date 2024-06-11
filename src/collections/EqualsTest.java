package collections;

import collections.models.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("123123", "test");
        Smartphone smartphone2 = new Smartphone("123123", "test");

        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone1.hashCode());
        System.out.println(smartphone2.hashCode());
    }
}
