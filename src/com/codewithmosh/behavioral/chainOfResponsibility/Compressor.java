package com.codewithmosh.behavioral.chainOfResponsibility;

public class Compressor extends Handler{
    public Compressor(Handler next) {
        super(next);
    }

    public void compress(HttpRequest request){
        System.out.println("Compressed");
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        compress(request);
        return false;
    }
}
