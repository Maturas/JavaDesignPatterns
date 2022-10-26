package org.example.SOLID.SingleResponsibilityPrinciple.GoodExample;

import java.util.List;

/*
    This is an example of abiding by the Single Responsibility Principle
    There are separate classes for representing separate objects - House, Person, Address
 */
public class House {
    private Address address;
    private List<Person> inhabitants;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Person> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<Person> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public House(Address address, List<Person> inhabitants) {
        this.address = address;
        this.inhabitants = inhabitants;
    }
}
