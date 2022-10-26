package org.example.SOLID.InterfaceSegregationPrinciple.BadExample;

/*
    A massive, not very universal interface, consisting of multiple methods, is a violation of the Interface Segregation Principle
 */
public interface HumanInterface {
    String getName(); // Not only humans have names
    void sleep(); // Not only humans sleep
    void eat(); // Not only humans eat
    void talk(); // Not only humans talk
    void goToWork(); // Only humans go to work
}
