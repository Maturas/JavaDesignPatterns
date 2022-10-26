package org.example.DesignPatterns.StructuralPatterns.Adapter;

public class DataBaseRecord {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer accountDeposit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAccountDeposit() {
        return accountDeposit;
    }

    public void setAccountDeposit(Integer accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    public DataBaseRecord(Integer id, String firstName, String lastName, Integer accountDeposit) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountDeposit = accountDeposit;
    }
}
