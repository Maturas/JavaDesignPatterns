package org.example.SOLID.LiskovSubstitutionPrinciple.BadExample;

/*
    This class violates the Liskov Substitution Principle, as it doesn't have all the functionalities
    of its base type - you cannot withdraw money from it, it will cause an exception.
 */
public class SavingAccount extends BankAccount {
    public SavingAccount(Integer deposit) {
        super(deposit);
    }

    @Override
    public Integer withdrawMoney(Integer amount) {
        throw new UnsupportedOperationException("Cannot withdraw money from a saving account!");
    }
}
