package com.neoteric.message;

public class VoiceMessage extends Message {

    public VoiceMessage(String sender, String reciever) {
        super(sender, reciever);
    }

    @Override
    public void send() {
        System.out.println("Voice:[voicemsg]");

    }
}
