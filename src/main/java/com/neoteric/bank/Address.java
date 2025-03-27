package com.neoteric.bank;

public class Address {
    public String city;
    public String state;
    public String country;
    public String pincode;
    public String hno;
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPincode() {
        return pincode;
    }

    public String getHno() {
        return hno;
    }

    public Address(String city, String state, String country, String pincode, String hno) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.hno = hno;
    }
}
