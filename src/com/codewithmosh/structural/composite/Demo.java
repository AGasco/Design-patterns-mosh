package com.codewithmosh.structural.composite;

public class Demo {
    public static void show(){
        var group1 = new Group();
        group1.add(new Shape()); // square
        group1.add(new Shape()); // square

        var group2 = new Group();
        group2.add(new Shape()); // circle
        group2.add(new Shape()); // circle

        var group3 = new Group();
        group3.add(group1);
        group3.add(group2);
        group3.render();

        group3.move();
    }
}
