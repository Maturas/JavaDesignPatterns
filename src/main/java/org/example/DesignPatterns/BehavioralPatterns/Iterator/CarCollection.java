package org.example.DesignPatterns.BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    This class implements the Iterable interface, which allows for a foreach-like iteration
    over its instances. The type of the Iterable doesn't necessarily have to be Car.
    For example, it could be a String, and then it would return cars' names.
 */
public class CarCollection implements Iterable<Car> {
    private final List<Car> cars;

    public CarCollection() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator() {
            private Integer currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < cars.size() && cars.get(currentIndex) != null;
            }

            @Override
            public Car next() {
                return cars.get(currentIndex++);
            }
        };
    }
}
