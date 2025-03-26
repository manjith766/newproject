package com.neoteric.employee;

public class Address {
   public String State;
   public String pincode;
   public String city;

    public Address(String state,String pincode,String city) {
        this.State = "hyd";
        this.city ="kukatpally";
    this.pincode= "2233";

    }

    @Override
    public String toString() {
        return "Address{" +
                "State='" + State + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
