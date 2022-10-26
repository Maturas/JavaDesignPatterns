package org.example.DesignPatterns.BehavioralPatterns.Mediator.GoodExample;

public class Mediator {
    private A a;
    private B b;
    private C c;
    private D d;

    public Mediator(A a, B b, C c, D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        this.a.setMediator(this);
        this.b.setMediator(this);
        this.c.setMediator(this);
        this.d.setMediator(this);
    }
}
