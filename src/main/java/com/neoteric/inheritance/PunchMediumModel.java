package com.neoteric.inheritance;

import java.util.ArrayList;
import java.util.List;

public class PunchMediumModel extends PunchBaseCar {

    public Car getCar() {
        Engine engine = getEngine();
        List<Wheel> wheelList = new ArrayList<>();
        wheelList.add(new Wheel("alloy"));
        wheelList.add(new Wheel("alloy"));
        wheelList.add(new Wheel("alloy"));
        wheelList.add(new Wheel("alloy"));
        List<Lights> lightsList = new ArrayList<>();
        lightsList.add(new Lights("Led"));
        Car car = new Car(engine, wheelList, lightsList);
        return car;
    }

    @Override
    protected Wheel getWheeltype() {
        return null;
    }

    @Override
    protected Lights getLighttype() {
        return null;
    }
}
