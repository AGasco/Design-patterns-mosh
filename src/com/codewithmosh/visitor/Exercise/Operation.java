package com.codewithmosh.visitor.Exercise;

public interface Operation {
    void apply(FactSegment fact);
    void apply(FormatSegment format);
}
