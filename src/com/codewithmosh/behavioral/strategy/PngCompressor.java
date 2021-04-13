package com.codewithmosh.behavioral.strategy;

public class PngCompressor implements Compressor{
    @Override
    public String compress() {
        return "Compressing with png";
    }
}
