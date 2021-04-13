package com.codewithmosh.behavioral.visitor.Exercise;

public class NoiseReductionOperation implements Operation{
    @Override
    public void apply(FactSegment fact) {
        System.out.println("Applying noise reduction to fact segment");
    }

    @Override
    public void apply(FormatSegment format) {
        System.out.println("Applying noise reduction to format segment");
    }
}
