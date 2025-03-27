package com.neoteric.constructor;

public class Hello {
    int x;
    //constructor
    public Hello(int y){
        x = y;
    }

    public static void main (String[] args){
      Hello  myobj = new Hello(8);// creating an object of class main
        System.out.println( myobj.x);
    }
}
