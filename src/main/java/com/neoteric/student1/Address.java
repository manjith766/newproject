package com.neoteric.student1;

public class Address {
    String state;
    String city;
    String pincode;
    public Address(String state,String city,String pincode){
    this.state = "hyd";
    this.city ="hyd";
    this.pincode = "2233";
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
