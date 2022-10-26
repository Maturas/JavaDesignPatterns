package org.example.DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

/*
    A single chain method, which is supposed to return true if it was executed successfully.
    If it returns false, the chain should not continue to execute further methods.
 */
public interface ChainMethod {
    Boolean execute();
}
