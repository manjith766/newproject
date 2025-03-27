package com.neoteric.inheritance;

public class PunchBasicModel extends PunchBaseCar {

    public Car getCar() {
        Engine engine = getEngine();
        Car car= new Car(engine);
        return car;



    }

}
