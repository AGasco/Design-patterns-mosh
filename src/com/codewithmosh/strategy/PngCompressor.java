package com.codewithmosh.strategy;

public class PngCompressor implements Compressor{
    @Override
    public String compress() {
        return "Compressing with png";
    }
}
