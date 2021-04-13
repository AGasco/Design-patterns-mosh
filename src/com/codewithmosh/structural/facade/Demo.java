package com.codewithmosh.structural.facade;

public class Demo {
    public static void show(){
        var notificationService = new NotificationService();
        notificationService.send("Hello World", "pepe");
    }
}
