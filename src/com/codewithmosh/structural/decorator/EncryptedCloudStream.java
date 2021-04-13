package com.codewithmosh.structural.decorator;

public class EncryptedCloudStream implements Stream {
    private Stream stream;


    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data){
        System.out.println("encrypting " + data);
        return "!)()·$()()$%?&$?&=)$%";
    }
}
