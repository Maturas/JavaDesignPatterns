package org.example.DesignPatterns.BehavioralPatterns.Observer;

import java.util.HashSet;
import java.util.Set;

/*
    This class serves as a text message broadcaster - it can broadcast its message
    to its registered receivers (observers). Then it doesn't really care how the message
    is handled or by what class/object.
 */
public class MessageBroadcaster {
    private final Set<MessageReceiverInterface> receivers = new HashSet<>();

    public void registerReceiver(MessageReceiverInterface receiver) {
        receivers.add(receiver);
    }

    public void unregisterReceivers(MessageReceiverInterface receiver) {
        receivers.remove(receiver);
    }

    public void broadcastMessage(String message) {
        receivers.forEach(r -> r.onMessageReceive(message));
    }

    public static void example() {
        MessageBroadcaster broadcaster = new MessageBroadcaster();
        Smartphone samsung = new Smartphone();
        Smartphone xiaomi = new Smartphone();
        Cellphone nokia = new Cellphone();

        broadcaster.registerReceiver(samsung);
        broadcaster.registerReceiver(xiaomi);
        broadcaster.registerReceiver(nokia);

        broadcaster.broadcastMessage("Test message");
    }
}
