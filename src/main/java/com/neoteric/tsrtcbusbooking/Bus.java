package com.neoteric.tsrtcbusbooking;

public class Bus {
    String fromlocation;
    String tolocation;
    String busno;
    String  busservice;

    @Override
    public String toString() {
        return "Bus{" +
                "fromlocation='" + fromlocation + '\'' +
                ", tolocation='" + tolocation + '\'' +
                ", busno='" + busno + '\'' +
                ", busservice='" + busservice + '\'' +
                '}';
    }
}
