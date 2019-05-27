package com.buzilov.patterns.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
