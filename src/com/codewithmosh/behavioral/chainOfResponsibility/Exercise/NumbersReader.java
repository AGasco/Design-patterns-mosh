package com.codewithmosh.behavioral.chainOfResponsibility.Exercise;

public class NumbersReader extends Handler{
    public NumbersReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if (filename.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }
        return false;
    }
}
