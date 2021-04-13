package com.codewithmosh.structural.flyweight;

public class Demo {
    public static void show(){
        var pointIconFactory = new PointIconFactory();
        var service = new PointService(pointIconFactory);
        for (var point: service.getPoints())
            point.draw();
    }
}
