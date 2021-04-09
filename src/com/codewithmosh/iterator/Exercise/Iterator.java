package com.codewithmosh.iterator.Exercise;

public interface Iterator<T> {
    void next();
    T current();
    boolean hasNext();
}
