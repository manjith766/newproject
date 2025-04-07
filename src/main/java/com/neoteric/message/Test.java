package com.neoteric.message;

public class Test{
    public static void main(String[] args) {
        Message message=new TextMessage("ram","boby");
        message.send();
        message.printHeader();
    }
}
