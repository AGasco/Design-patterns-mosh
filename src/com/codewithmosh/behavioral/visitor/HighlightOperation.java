package com.codewithmosh.behavioral.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Applied highlight to heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Applied highlight to anchor");
    }
}
