package com.neoteric.studentdemo;

public class Address {
    public String state;
    public String district;
    public String city;
    public String houseNo;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

