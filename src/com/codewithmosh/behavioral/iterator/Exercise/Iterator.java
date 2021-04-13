package com.codewithmosh.behavioral.iterator.Exercise;

public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();
}
