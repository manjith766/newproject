package com.neoteric.hotelBokking;

public class Location {
    String State;
    String district;
    String city;
    String pincode;

    public Location(String state, String district, String city, String pincode) {
        State = state;
        this.district = district;
        this.city = city;
        this.pincode = pincode;
    }
}
