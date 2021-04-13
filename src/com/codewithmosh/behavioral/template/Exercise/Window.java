package com.codewithmosh.behavioral.template.Exercise;

public abstract class Window {
    public void close() {
        doBeforeClosing();

        System.out.println("Removing the window from the screen");

        doAfterClosing();
    }

    protected abstract void doBeforeClosing();

    protected abstract void doAfterClosing();
}
