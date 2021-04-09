package com.codewithmosh.strategy;

public class Demo {
    public static void show(){
        var imageStorage = new ImageStorage();

        imageStorage.store("file1", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("file1", new PngCompressor(), new HighContrastFilter());
    }
}
