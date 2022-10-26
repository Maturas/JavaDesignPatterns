package org.example.DesignPatterns.BehavioralPatterns.Observer;

public class Smartphone implements MessageReceiverInterface {
    @Override
    public void onMessageReceive(String message) {
        System.out.println("Pushing a notification on a smartphone:");
        System.out.println(message);
    }
}
