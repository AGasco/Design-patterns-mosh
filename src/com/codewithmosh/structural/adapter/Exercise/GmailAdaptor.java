package com.codewithmosh.structural.adapter.Exercise;

import com.codewithmosh.structural.adapter.Exercise.Gmail.GmailClient;

public class GmailAdaptor implements EmailProvider{
     private GmailClient gmail;

     public GmailAdaptor(GmailClient gmail){
         this.gmail = gmail;
     }

    @Override
    public void downloadEmails() {
        gmail.connect();
        gmail.getEmails();
    }
}
