package com.buzilov.patterns.behavioral.observer;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String eventType, Object oldObject, Object newObject);
}
