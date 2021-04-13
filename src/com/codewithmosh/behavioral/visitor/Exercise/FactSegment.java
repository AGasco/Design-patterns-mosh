package com.codewithmosh.behavioral.visitor.Exercise;

public class FactSegment implements Segment {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
