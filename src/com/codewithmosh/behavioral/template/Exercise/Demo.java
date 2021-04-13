package com.codewithmosh.behavioral.template.Exercise;

public class Demo {
    public static void show(){
        var photoshopWindow = new PhotoshopWindow();
        var wordWindow = new WordWindow();
        photoshopWindow.close();
        wordWindow.close();
    }
}
