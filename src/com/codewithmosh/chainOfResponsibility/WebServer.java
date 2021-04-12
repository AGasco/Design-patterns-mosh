package com.codewithmosh.chainOfResponsibility;

public class WebServer {
    private Handler firstHandler;

    public WebServer(Handler firstHandler){
        this.firstHandler = firstHandler;
    }

    public void handle(HttpRequest request){
        firstHandler.handle(request);
    }
}
