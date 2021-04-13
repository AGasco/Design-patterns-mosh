package com.codewithmosh.behavioral.iterator;

public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();
}
