package org.example.DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

import java.util.Optional;

/*
    A single link in a Chain of Responsibility, which has a method and an optional reference to the next link.
 */
public class ChainLink {
    private final Optional<ChainLink> next;
    private final ChainMethod method;

    public ChainLink(ChainMethod method) {
        this.next = Optional.empty();
        this.method = method;
    }

    public ChainLink(ChainMethod method, ChainLink next) {
        this.method = method;
        this.next = Optional.of(next);
    }

    public void execute() {
        Boolean methodCompleted = method.execute();

        if (methodCompleted && next.isPresent()) {
            next.get().execute();
        }
    }
}
