package org.example.SOLID.LiskovSubstitutionPrinciple.GoodExample;

import java.util.Optional;

public class BankAccount {
    protected Integer deposit;

    public BankAccount(Integer deposit) {
        this.deposit = deposit;
    }

    public void depositMoney(Integer amount) {
        deposit += amount;
    }

    public Optional<Integer> tryWithdrawMoney(Integer amount) {
        if (deposit >= amount) {
            deposit -= amount;
            return Optional.of(amount);
        }
        else {
            return Optional.empty();
        }
    }
}

