package com.codewithmosh.visitor.Exercise;

public class Demo {
    public static void show(){
        var wavFile = WavFile.read("pepaso.wav");
        wavFile.execute(new NoiseReductionOperation());
        wavFile.execute(new ReverbOperation());
        wavFile.execute(new NormalizeOperation());
    }
}
