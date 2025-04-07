package com.neoteric.message;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public abstract class Message {
  protected String sender;
   protected String reciever;
    protected LocalDateTime dateTime;
    protected String messageId;


    public Message(String sender, String reciever) {
        this.sender = sender;
        this.reciever = reciever;
        this.dateTime = LocalDateTime.now();
        this.messageId = UUID.randomUUID().toString();
    }



    public abstract void send() ;



    protected void printHeader(){
        DateTimeFormatter  formatter= DateTimeFormatter.ofPattern("yyy-mm-dd HH:MM:SS");
        System.out.println("Message ID: " + messageId);
        System.out.println("From: " + sender + " -> To: " + reciever);
        System.out.println("Sent At: " + dateTime.format(formatter));
      /*  System.out.println("DateTime : " + dateTime);
        System.out.println("Sent At (formatted): " + dateTime.format(formatter));*/




    }

}

