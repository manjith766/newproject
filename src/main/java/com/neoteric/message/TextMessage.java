package com.neoteric.message;

public class TextMessage extends Message {


    public TextMessage(String sender, String reciever) {
        super(sender, reciever);
    }

    @Override
    public void send() {
        System.out.println("Text:Hello Welocme to Neotric");
    }
}
