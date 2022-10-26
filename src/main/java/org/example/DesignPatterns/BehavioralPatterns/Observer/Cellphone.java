package org.example.DesignPatterns.BehavioralPatterns.Observer;

public class Cellphone implements MessageReceiverInterface {
    @Override
    public void onMessageReceive(String message) {
        System.out.println("Playing a text message sound and displaying it on the screen: ");
        System.out.println(message);
    }
}
