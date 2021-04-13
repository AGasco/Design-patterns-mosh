package com.codewithmosh.behavioral.visitor.Exercise;

public class FormatSegment implements Segment {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
