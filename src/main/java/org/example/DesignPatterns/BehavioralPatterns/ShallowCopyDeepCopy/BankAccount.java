package org.example.DesignPatterns.BehavioralPatterns.ShallowCopyDeepCopy;

/*
    This class has a complex-type variable - BankTransfer
    Therefore it requires the distinction between a Shallow Copy and a Deep Copy
 */
public class BankAccount {
    private final Integer id;
    private final String accountHolder;
    private final Integer deposit;
    private final BankTransfer lastTransfer;

    public BankAccount(Integer id, String accountHolder, Integer deposit, BankTransfer lastTransfer) {
        this.id = id;
        this.accountHolder = accountHolder;
        this.deposit = deposit;
        this.lastTransfer = lastTransfer;
    }

    /*
        The original object and the shallow copy have the same lastTransfer object (only the reference has been copied)
     */
    public BankAccount shallowCopy() {
        return new BankAccount(id, accountHolder, deposit, lastTransfer);
    }

    /*
        The original object and the deep copy have different lastTransfer objects (the object has also been copied)
     */
    public BankAccount deepCopy() {
        BankTransfer transfer = new BankTransfer(lastTransfer.getSenderId(), lastTransfer.getReceiverId(), lastTransfer.getTitle(), lastTransfer.getAmount());
        return new BankAccount(id, accountHolder, deposit, transfer);
    }

    public Integer getId() {
        return id;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public BankTransfer getLastTransfer() {
        return lastTransfer;
    }
}
