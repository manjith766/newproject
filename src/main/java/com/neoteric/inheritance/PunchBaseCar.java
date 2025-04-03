package com.neoteric.inheritance;

public abstract class PunchBaseCar {
    public PunchBaseCar() {
        System.out.println("from punch base car");
    }

    public Engine getEngine() {

        return new Engine("200");

    }


    protected abstract Wheel getWheeltype();

    protected abstract Lights getLighttype();
}