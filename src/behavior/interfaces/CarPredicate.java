package behavior.interfaces;

import behavior.models.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
