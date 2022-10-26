package org.example.SOLID.DependencyInversionPrinciple.GoodExample;

/*
    This class obeys the Dependency Inversion Principle, as it relies on getting Customer data from an interface,
    not a concrete implementation, which allows for usage of various sources of data (JSON, CSV, SQL, noSQL, etc.).
    Also, it doesn't initialize the DAO, instead it expects it as its constructor's parameter.
 */
public class CustomerController {
    private DaoInterface<Customer> dao;

    public CustomerController(DaoInterface<Customer> dao) {
        this.dao = dao;
    }
}
