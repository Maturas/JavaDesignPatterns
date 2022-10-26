package org.example.SOLID.DependencyInversionPrinciple.BadExample;

public class CustomerJsonDao {
    private final String filePath;

    public CustomerJsonDao(String filePath) {
        this.filePath = filePath;
    }

    public Customer get(Integer id) {
        // TODO read customer object from JSON file
        return null;
    }

    public Boolean exists(Integer id) {
        // TODO check if customer exists in JSON file
        return null;
    }
}
