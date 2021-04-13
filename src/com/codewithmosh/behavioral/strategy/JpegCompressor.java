package com.codewithmosh.behavioral.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public String compress() {
        return "Compressing using jpeg";
    }
}
