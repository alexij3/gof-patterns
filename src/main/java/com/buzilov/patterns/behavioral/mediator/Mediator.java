package com.buzilov.patterns.behavioral.mediator;

public interface Mediator<T> {
    void notify(T sender, String msg);
}
