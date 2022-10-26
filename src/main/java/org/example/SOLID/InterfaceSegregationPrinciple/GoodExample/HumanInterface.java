package org.example.SOLID.InterfaceSegregationPrinciple.GoodExample;

/*
    This interface extends a set of smaller interfaces, which is beneficial in two ways.
    First, the small interfaces are more universal and can be used in more classes.
    Second, the HumanInterface is as convenient to use as the big interface from Bad Example.
 */
public interface HumanInterface extends EatInterface, NameInterface, SleepInterface, TalkInterface {
    void goToWork();
}
