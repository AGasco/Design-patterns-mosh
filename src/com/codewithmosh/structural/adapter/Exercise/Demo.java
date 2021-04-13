package com.codewithmosh.structural.adapter.Exercise;

import com.codewithmosh.structural.adapter.Exercise.Gmail.GmailClient;

public class Demo {
    public static void show(){
        var emailClient = new EmailClient();

        emailClient.addProvider(new GmailAdaptor(new GmailClient()));
        emailClient.downloadEmails();
    }
}
