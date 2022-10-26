package org.example.DesignPatterns.ConstructionalPatterns.Factory;

public class AnimalFactory {
    public static Animal createAnimal(String animalType, String name, Integer age) {
        return switch (animalType) {
            case "Dog" -> new Dog(name, age);
            case "Cat" -> new Cat(name, age);
            case "Fish" -> new Fish(name, age);
            default -> throw new IllegalArgumentException();
        };
    }
}
