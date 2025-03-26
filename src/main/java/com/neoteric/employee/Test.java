package com.neoteric.employee;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("hyd", "2233", "kukatpally");
        Employe employe = new Employe("rama", "12", address);
        System.out.println(employe);
    }
}
