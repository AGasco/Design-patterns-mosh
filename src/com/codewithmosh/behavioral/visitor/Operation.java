package com.codewithmosh.behavioral.visitor;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
