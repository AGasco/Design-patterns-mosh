package com.codewithmosh.structural.decorator;

public class Demo {
    public static void show(){
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-5223-1235-1235");
    }
}
