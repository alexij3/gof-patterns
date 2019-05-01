package com.buzilov.patterns.behavioral.observer;

public interface IObserver {
    void update(String eventType, Object oldObject, Object newObject);
}
