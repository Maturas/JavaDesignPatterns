package org.example.SOLID.LiskovSubstitutionPrinciple.GoodExample;

import java.util.Optional;

/*
    This class obeys the Liskov Substitution Principle, as it can TRY to withdraw money, just as its base class.
 */
public class SavingAccount extends BankAccount {
    public SavingAccount(Integer deposit) {
        super(deposit);
    }

    @Override
    public Optional<Integer> tryWithdrawMoney(Integer amount) {
        return Optional.empty();
    }
}
