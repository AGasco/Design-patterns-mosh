package com.codewithmosh.chainOfResponsibility.Exercise;

public class DataReader {
    private Handler firstHandler;

    public DataReader(Handler firstHandler){
        this.firstHandler = firstHandler;
    }

    public void read(String fileName) {
        firstHandler.handle(fileName);
    }
}
