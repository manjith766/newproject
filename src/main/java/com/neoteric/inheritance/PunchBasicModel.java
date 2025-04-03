package com.neoteric.inheritance;

import java.util.ArrayList;
import java.util.List;

public class PunchBasicModel extends PunchBaseCar {

    public Car getCar() {
        Engine engine = getEngine();
        List<Wheel>wheelList = new ArrayList<>();
        wheelList.add(getWheeltype());
        wheelList.add(getWheeltype());
        wheelList.add(getWheeltype());
        wheelList.add(getWheeltype());
        wheelList.add(new Wheel("basic"));
        List<Lights>lightsList = new ArrayList<>();
        lightsList.add(new Lights("yellow"));


        Car car =new Car(engine,wheelList,lightsList);
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
