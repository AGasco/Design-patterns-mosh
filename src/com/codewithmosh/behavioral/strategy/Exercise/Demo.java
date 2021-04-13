package com.codewithmosh.behavioral.strategy.Exercise;

public class Demo {
    public static void show(){
        var chatClient = new ChatClient();
        chatClient.send("Hello World", new DesEncryptor());
    }
}
