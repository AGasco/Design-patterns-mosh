package com.codewithmosh.strategy.Exercise;

public class AesEncryptor implements Encryptor{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
