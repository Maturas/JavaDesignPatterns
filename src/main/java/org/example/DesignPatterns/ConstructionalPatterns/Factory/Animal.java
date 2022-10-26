package org.example.DesignPatterns.ConstructionalPatterns.Factory;

public abstract class Animal {
    private final String name;
    private final Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
