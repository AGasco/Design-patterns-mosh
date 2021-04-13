package com.codewithmosh.behavioral.template.Exercise;

public class WordWindow extends Window{
    @Override
    protected void doBeforeClosing() {
        System.out.println("Doing stuff before closing Word Window");
    }

    @Override
    protected void doAfterClosing() {
        System.out.println("Doing stuff after closing Word Window");
    }
}
