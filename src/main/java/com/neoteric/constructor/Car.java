package com.neoteric.constructor;

public class Car {
    int modelYear;
    String Model;

    public Car( int year,String name){
        modelYear = year;
        Model= name;
    }

    public static void main(String[] args) {
        Car myCar =new Car(1600,"swift");
        System.out.println(myCar.modelYear+" "+myCar.Model);
    }
}
