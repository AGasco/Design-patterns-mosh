package com.codewithmosh.behavioral.strategy.Exercise;

public class DesEncryptor implements Encryptor{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
    }
}
