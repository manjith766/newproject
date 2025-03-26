package com.neoteric.studentdemo;

public class Studentform {
    public String name;
    public String rollNo;
    public int age;
    public String standard;
    public String mobileNo;


    public Address studentAddress;

    @Override
    public String toString() {
        return "Studentform{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                ", standard='" + standard + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", studentAddress=" + studentAddress +
                ", schoolAddress=" + schoolAddress +
                '}';
    }

    public Address schoolAddress;

}