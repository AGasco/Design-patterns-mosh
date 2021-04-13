package com.codewithmosh.behavioral.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    public boolean authenticate(HttpRequest request){
        var isValid = request.getUsername() == "admin" && request.getPassword() == "1234";

        System.out.println("Authentication");
        return isValid;
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        return !authenticate(request);
    }
}
