package org.example.SOLID.DependencyInversionPrinciple.BadExample;

/*
    This class violates the Dependency Inversion Principle, as it relies on getting Customer data from
    a concrete reference - CustomerJsonDao - which severely limits possibilities of implementing alternative
    data sources, like an SQL database for example. Also, the class initializes the DAO instead of just expecting it.
 */
public class CustomerController {
    private CustomerJsonDao dao;
    private static final String filePath = "data.json";

    public CustomerController() {
        this.dao = new CustomerJsonDao(filePath);
    }
}
