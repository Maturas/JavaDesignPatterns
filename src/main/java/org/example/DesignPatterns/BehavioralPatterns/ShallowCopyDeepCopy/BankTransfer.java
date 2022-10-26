package org.example.DesignPatterns.BehavioralPatterns.ShallowCopyDeepCopy;

/*
    This class does not have any complex-type variables, therefore it doesn't require
    the distinction between a Shallow Copy and a Deep Copy
 */
public class BankTransfer {
    private final Integer senderId;
    private final Integer receiverId;
    private final String title;
    private final Integer amount;

    public BankTransfer(Integer senderId, Integer receiverId, String title, Integer amount) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.title = title;
        this.amount = amount;
    }

    public BankTransfer copy() {
        return new BankTransfer(senderId, receiverId, title, amount);
    }

    public Integer getSenderId() {
        return senderId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getAmount() {
        return amount;
    }
}
