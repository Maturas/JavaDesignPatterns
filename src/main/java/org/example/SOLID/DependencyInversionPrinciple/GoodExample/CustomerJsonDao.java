package org.example.SOLID.DependencyInversionPrinciple.GoodExample;

public class CustomerJsonDao implements DaoInterface<Customer> {
    private final String filePath;

    public CustomerJsonDao(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Customer get(Integer id) {
        // TODO read customer object from JSON file
        return null;
    }

    @Override
    public Boolean exists(Integer id) {
        // TODO check if customer exists in JSON file
        return null;
    }
}
