package com.codewithmosh.visitor.Exercise;

public class NormalizeOperation implements Operation{

    @Override
    public void apply(FactSegment fact) {
        System.out.println("Applying normalize to fact segment");
    }

    @Override
    public void apply(FormatSegment format) {
        System.out.println("Applying normalize to format segment");
    }
}
