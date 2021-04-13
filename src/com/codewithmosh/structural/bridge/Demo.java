package com.codewithmosh.structural.bridge;

public class Demo {
    public static void show(){
        var sonyTV = new SonyTV();
        var sonyBasicRemote = new RemoteControl(sonyTV);
        var sonyAdvancedRemote = new AdvancedRemoteControl(new SamsungTV());

        sonyBasicRemote.turnOn();
        sonyBasicRemote.turnOff();

        sonyAdvancedRemote.turnOn();
        sonyAdvancedRemote.setChannel(4);
        sonyAdvancedRemote.turnOff();
    }
}
