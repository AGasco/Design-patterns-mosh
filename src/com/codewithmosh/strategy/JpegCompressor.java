package com.codewithmosh.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public String compress() {
        return "Compressing using jpeg";
    }
}
