package org.example.DesignPatterns.BehavioralPatterns.Iterator;

public class Car {
    private final String brand;
    private final String model;
    private final Integer yearProduced;

    public Car(String brand, String model, Integer yearProduced) {
        this.brand = brand;
        this.model = model;
        this.yearProduced = yearProduced;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearProduced() {
        return yearProduced;
    }
}
