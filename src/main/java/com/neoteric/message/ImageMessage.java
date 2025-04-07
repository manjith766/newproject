package com.neoteric.message;

public class ImageMessage extends Message{
    public ImageMessage(String sender, String reciever) {
        super(sender, reciever);
    }

    @Override
    public void send() {
        System.out.println("Image: image.jpg");

    }
}
