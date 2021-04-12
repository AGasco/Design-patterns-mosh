package com.codewithmosh.chainOfResponsibility.Exercise;

public abstract class Handler {
    private Handler next;

    public Handler (Handler next){
        this.next = next;
    }

    public void handle(String filename){
        if (doHandle(filename))
            return;

        if (next != null)
            next.handle(filename);
        else
            System.out.println("File: " + filename + " is not supported");
    }

    public abstract boolean doHandle(String filename);
}
