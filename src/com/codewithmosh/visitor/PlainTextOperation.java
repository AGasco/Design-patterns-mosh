package com.codewithmosh.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Applied plain text to heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Applied plain text to anchor");
    }
}
