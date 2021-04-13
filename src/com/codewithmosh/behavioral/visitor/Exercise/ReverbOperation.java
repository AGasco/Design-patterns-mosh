package com.codewithmosh.behavioral.visitor.Exercise;

public class ReverbOperation implements Operation{
    @Override
    public void apply(FactSegment fact) {
        System.out.println("Applying reverb to fact segment");
    }

    @Override
    public void apply(FormatSegment format) {
        System.out.println("Applying reverb to format segment");
    }
}
