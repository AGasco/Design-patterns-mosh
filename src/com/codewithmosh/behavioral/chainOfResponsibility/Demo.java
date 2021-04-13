package com.codewithmosh.behavioral.chainOfResponsibility;

public class Demo {
    public static void show(){
        var logger = new Logger(null);
        var compressor = new Compressor(logger);
        var authenticator = new Authenticator(compressor);

        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }
}
