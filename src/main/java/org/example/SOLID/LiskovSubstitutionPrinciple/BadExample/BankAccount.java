package org.example.SOLID.LiskovSubstitutionPrinciple.BadExample;

public class BankAccount {
    protected Integer deposit;

    public BankAccount(Integer deposit) {
        this.deposit = deposit;
    }

    public void depositMoney(Integer amount) {
        deposit += amount;
    }

    public Integer withdrawMoney(Integer amount) {
        if (deposit >= amount) {
            deposit -= amount;
            return amount;
        }
        else {
            throw new IllegalArgumentException("Insufficient deposit!");
        }
    }
}
