package com.codewithmosh.behavioral.strategy;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter){
        System.out.println(compressor.compress());
        System.out.println(filter.apply());
    }
}
