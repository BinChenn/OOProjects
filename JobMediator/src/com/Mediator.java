package com;

public interface Mediator {
    void apply(Colleague applier, Colleague job);
    void notifyfinders();
}
