package com.codewithmosh.structural.facade;

public class NotificationServer {
    // connect -> Connection Object
    // authenticate(appId, key) -> AuthToken Object
    // send(authToken, message, target)
    // connection.disconnect()

    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println("Sending a message: " + message.toString());
    }
}
